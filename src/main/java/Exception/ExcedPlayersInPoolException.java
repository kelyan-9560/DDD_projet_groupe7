package Exception;

public class ExcedPlayersInPoolException extends Exception{
    public ExcedPlayersInPoolException(String errorMessage){
        super(errorMessage);
    }
}
