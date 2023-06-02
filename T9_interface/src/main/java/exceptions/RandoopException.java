package exceptions;

public class RandoopException extends Exception{

    public RandoopException(String message){
        super("[RANDOOP EXCEPTION]: "+message);
    }
}
