package randoop;

import interfaces.*;
import exceptions.RandoopException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

public class RandoopConnector implements IRandoopConnector{
    //singleton
    private static RandoopConnector instance;

    //gestione dei threads in esecuzione
    private static final int N_MAX = 10;
    private int numberThreads ;
    private Queue<RandoopRequest> requests;

    //implmentazione DP Observer
    private Dictionary<String,IObserver> observers;

    //implementazione DP Singleton
    protected RandoopConnector(){
        requests = new LinkedList<RandoopRequest>();
        observers = new Hashtable<String,IObserver>();
        numberThreads=0;

    }

    public static RandoopConnector getInstance(){
        if (instance == null) {
            instance = new RandoopConnector();
        }
        return instance;
    }

    //
    public void generateRandoopTest(String className, int maxNumberLevel, IObserver o) throws RandoopException{
        try {
            RandoopFilter f = new RandoopFilter(className);
            f.filter();
            observers.put(className, o);
            execRandoopTest(className, maxNumberLevel);
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }

    //creazione e gestione Threads
    private void execRandoopTest(String className, int maxNumberLevel){
        if(numberThreads < N_MAX) {
            numberThreads++;
            RandoopTestGenerator thread = new RandoopTestGenerator(className, this, maxNumberLevel, numberThreads);
            thread.start();
        }else{
            //metti la richiesta in coda
            requests.add(new RandoopRequest(className,maxNumberLevel));
        }
    }

    public synchronized void operationCompleted(int nSessions, String className, int threadIndex){
        System.out.println("[RANDOOP CONNECTOR] generation for class "+className+" completed by thread n"+threadIndex);
        numberThreads--;
        //invia la notifica che hai completato a chi è in ascolto
        observers.get(className).notifyCompleted(nSessions);
        observers.remove(className);

        //vedi se ci sono richieste in coda
        if(!requests.isEmpty()){
            RandoopRequest r = requests.remove();
            execRandoopTest(r.getClassName(),r.getnTests());
        }

    }
/*
    public static void main(String[] args){
        RandoopConnector r = new RandoopConnector();
        try {
            r.generateRandoopTest("Calcolatrice", new Observer());
        }catch(Exception e){
            e.printStackTrace();
        }
    }*/

}