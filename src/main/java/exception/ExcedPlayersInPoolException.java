package exception;

public class ExcedPlayersInPoolException extends Exception{
    public ExcedPlayersInPoolException(String errorMessage){
        super(errorMessage);
    }
}
