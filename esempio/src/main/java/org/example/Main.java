package org.example;

import exceptions.RandoopException;
import interfaces.IObserver;
import interfaces.IRandoopConnector;
import randoop.RandoopConnector;

public class Main implements IObserver {

    public static void main(String[] args) {
        Main main = new Main();
        IRandoopConnector randoopConnector = RandoopConnector.getInstance();
        try {
            randoopConnector.generateRandoopTest("Calcolatrice", 2, main);
        }catch (RandoopException e){
            e.printStackTrace();
            System.out.println("ERROR CODE: "+e.getERROR_TYPE());
        }

    }

    @Override
    public void notifyCompleted(int i) {
        System.out.println("N LEVELS COMPLETED: ="+i);
    }
}