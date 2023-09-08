package Aug19ExceptionHandling;

public class AgeLimitException extends Exception{
    public AgeLimitException(String message) {
        super(message);
    }
}
