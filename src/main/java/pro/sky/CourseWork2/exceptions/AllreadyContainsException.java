package pro.sky.CourseWork2.exceptions;

public class AllreadyContainsException extends RuntimeException {
    public AllreadyContainsException() {
    }

    public AllreadyContainsException(String message) {
        super(message);
    }

    public AllreadyContainsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AllreadyContainsException(Throwable cause) {
        super(cause);
    }

    public AllreadyContainsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
