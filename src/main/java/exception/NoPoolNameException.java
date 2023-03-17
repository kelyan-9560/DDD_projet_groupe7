package exception;

public class NoPoolNameException extends Exception{
    public NoPoolNameException(String errorMessage){
        super(errorMessage);
    }
}
