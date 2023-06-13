package admin;

import exceptions.RandoopException;
import interfaces.IObserver;
import interfaces.IRandoopConnector;
import randoop.RandoopConnector;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Observer implements IObserver {
    public void notifyCompleted (int numberSession){
        System.out.println("[OBSERVER]: "+ numberSession +" test sessions generated");
    }

    public static void main(String[] argv){
        IRandoopConnector instance = RandoopConnector.getInstance();
        Observer ob = new Observer();
        try {
            instance.generateRandoopTest("Calcolatrice", 7,ob) ;
            System.out.println("Richiesta per Calcolatrice inoltrata");
            //instance.generateRandoopTest("VCardBean",2, ob) ;
            //System.out.println("Richiesta per VCardBean inoltrata");
        }catch (RandoopException e){
            e.printStackTrace();
        }



    }

}
