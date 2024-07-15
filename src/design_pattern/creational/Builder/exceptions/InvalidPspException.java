package design_pattern.creational.Builder.exceptions;

public class InvalidPspException extends RuntimeException{
    public InvalidPspException() {
        super();
    }

    public InvalidPspException(String message) {
        super(message);
    }

    public InvalidPspException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPspException(Throwable cause) {
        super(cause);
    }

    protected InvalidPspException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
