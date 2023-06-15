package client;

import exceptions.RandoopException;
import interfaces.IObserver;
import interfaces.IRandoopConnector;
import randoop.RandoopConnector;

import java.io.FileWriter;
import java.io.IOException;

public class RandoopMain {

    public static void main(String args[]){
        String className = args[0];
        int nLevels = Integer.parseInt(args[1]);
        System.out.println("Ricevuta richiesta per classe=<"+className+">, numero di livelli=<"+nLevels+">");
        RandoopConnector randoopConnector = RandoopConnector.getInstance();
        randoopConnector.setRepositoryDir("/Users/rosariaritacanale/.T9_repo_test");
        IObserver observer = new Observer();
        try {
            randoopConnector.generateRandoopTest(className, nLevels, observer);
        }catch (RandoopException e){
            //write to log file
            String errorMessage = "RandoopException: " + e.getMessage() + "\t error code: " + e.getERROR_TYPE();
            try {
                String logFilePath = "/Users/rosariaritacanale/Desktop/log.txt";
                FileWriter file = new FileWriter(logFilePath,true); //true così scrive in append
                file.write(errorMessage);
                file.close();
            }catch(IOException e1){
                System.out.println("UNABLE TO WRITE LOG FILE. Error message was:");
                System.out.println(errorMessage);
                e1.printStackTrace();
            }
        }
    }
}
