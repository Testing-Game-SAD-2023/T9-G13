package exceptions;

public class RandoopException extends Exception{

    private int ERROR_TYPE;
    //1: directory does not exist
    //2: class is not in directory
    //3: unable to compile class
    public RandoopException(String message, int error_type){
        super("[RANDOOP EXCEPTION]: "+message);
        this.ERROR_TYPE =error_type;
    }
    public int getERROR_TYPE(){return ERROR_TYPE;}
}
