package randoop;

import interfaces.IRandoopConnector;
import exceptions.RandoopException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class RandoopConnector implements IRandoopConnector{

    private boolean isRunning = false;
    private int numberThreads = 0;
    private Queue<String> requests = new Queue<String>(); //inzializza

    private Dictionary<IObserver,String> observers;


    public void attach(IObserver o, String className){
        observers.add(o, className);
    }

    private void execRandoopTest(String className){
        if(numberThreads <= N_MAX) {
            numberThreads++;
            RandoopTestGenerator thread = new RandoopTestGenerator(className, this);
            thread.start();
        }else{
            requests.add(className);
        }
    }

    /*
    private void execScript(String classname) throws Exception{
        Process p = Runtime.getRuntime().exec("python3 /Users/rosariaritacanale/git/T9-G13/main.py "+classname);
        p.getErrorStream().transferTo(System.out);
        //p.getInputStream().transferTo(System.out);
        p.waitFor();

    }
    */


    public void generateRandoopTest(String className) throws RandoopException{
        RandoopFilter f = new RandoopFilter(className);
        try{
            f.filter();
            //execScript(className);
            execRandoopTest(className);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void operationCompleted(int nSessions, String className){
        numberThreads--;
        //invia la notifica che hai completato a chi è in ascolto


        //vedi se ci sono richieste in coda
        if(!requests.isEmpty()){
            execRandoopTest(requests.remove());

        }

    }

    public static void main(String[] args){
        RandoopConnector r = new RandoopConnector();
        try {
            r.generateRandoopTest("Calcolatrice");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}