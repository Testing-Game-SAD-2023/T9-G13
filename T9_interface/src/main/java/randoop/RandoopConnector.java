package randoop;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class RandoopConnector implements IRandoopConnector{

    private boolean isRunning = false;

    /*private void startProcess(){
        try {
            Process p = Runtime.getRuntime().exec("chmod -+x startDocker.sh && ./startDocker.sh")
            if(p.waitFor() != 0){
                throw new Exception("Unable to start the process !!\n")
            }
            isRunning = true;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    };*/

    private void execRandoopTest(String className){
       // Process p = Runtime.getRuntime().exec("chmod -+x execTests.sh && ./execTests.sh " + className)
        RandoopTestGenerator thread = new RandoopTestGenerator(className,this);
        thread.start();
    }

    private void execScript(String classname) throws Exception{
        Process p = Runtime.getRuntime().exec("python3 /Users/rosariaritacanale/git/T9-G13/main.py "+classname);
        p.getErrorStream().transferTo(System.out);
        //p.getInputStream().transferTo(System.out);
        p.waitFor();

    }

    /*

    public void stopProcess(){
        try {
            Process p = Runtime.getRuntime().exec("docker rm -f T9")
            if(p.waitFor() != 0){
                throw new Exception("Unable to stop process !!\n")
            }
            isRunning = false;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    };
*/

    public void generateRandoopTest(String className) throws Exception{
        RandoopFilter f = new RandoopFilter(className);
        try{
            f.filter();
            //execScript(className);
            execRandoopTest(className);
        }catch(Exception e){
            e.printStackTrace();
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