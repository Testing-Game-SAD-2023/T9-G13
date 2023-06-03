package randoop;

import exceptions.RandoopException;
import interfaces.IObserver;
import interfaces.IRandoopConnector;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Observer implements IObserver {
    public void notifyCompleted (int numberSession){
        System.out.println("[OBSERVER]: "+ numberSession +" test sessions generated");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/rosariaritacanale/git/T9-G13/output.txt"));
            writer.write("number of sessions: "+numberSession);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] argv){
        IRandoopConnector instance = RandoopConnector.getInstance();
        Observer ob = new Observer();
        try {
            instance.generateRandoopTest("Calcolatrice", ob) ;
            System.out.println("Richiesta per Calcolatrice inoltrata");
            instance.generateRandoopTest("VCardBean", ob) ;
            System.out.println("Richiesta per VCardBean inoltrata");
        }catch (RandoopException e){
            e.printStackTrace();
        }



    }

}
