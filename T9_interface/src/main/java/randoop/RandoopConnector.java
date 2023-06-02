package randoop;

import exceptions.RandoopException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class RandoopConnector implements IRandoopConnector{

    private boolean isRunning = false;

    private void execRandoopTest(String className){

        RandoopTestGenerator thread = new RandoopTestGenerator(className,this);
        thread.start();
    }

    private void execScript(String classname) throws Exception{
        Process p = Runtime.getRuntime().exec("python3 /Users/rosariaritacanale/git/T9-G13/main.py "+classname);
        p.getErrorStream().transferTo(System.out);
        //p.getInputStream().transferTo(System.out);
        p.waitFor();

    }

    public void generateRandoopTest(String className) throws RandoopException{
        RandoopFilter f = new RandoopFilter(className);
        try{
            f.filter();
            //execScript(className);
           // execRandoopTest(className);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void operationCompleted(int nSessions, String className){
        //invia la notifica che hai completato a chi è in ascolto
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