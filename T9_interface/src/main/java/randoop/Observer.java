package randoop;

import interfaces.IObserver;

public class Observer implements IObserver {
    public void notifyCompleted (int numberSession){
        System.out.println(numberSession);
    }


    public static void main(String[] args){
        RandoopConnector istance = RandoopConnector.getInstance();
        Observer ob = new Observer();
        try {
            istance.generateRandoopTest("Calcolatrice", ob) ;
            System.out.println("Ciao");
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
