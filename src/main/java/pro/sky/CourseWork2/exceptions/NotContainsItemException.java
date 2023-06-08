package pro.sky.CourseWork2.exceptions;

public class NotContainsItemException extends RuntimeException{
    public NotContainsItemException() {
    }

    public NotContainsItemException(String message) {
        super(message);
    }

    public NotContainsItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotContainsItemException(Throwable cause) {
        super(cause);
    }

    public NotContainsItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
