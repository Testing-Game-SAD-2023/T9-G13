package randoop;

import exceptions.RandoopException;
import interfaces.IObserver;
import interfaces.IRandoopConnector;


public class Observer implements IObserver {
    public void notifyCompleted (int numberSession){
        System.out.println(numberSession);
    }

    public static void main(String[] argv){
        IRandoopConnector instance = RandoopConnector.getInstance();
        Observer ob = new Observer();
        try {
            instance.generateRandoopTest("Calcolatrice", ob) ;
            System.out.println("Ciao");
        }catch (RandoopException e){
            e.printStackTrace();
        }


    }

}
