package pro.sky.CourseWork2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class SetIndexOutOfBoundsException extends RuntimeException {
    public SetIndexOutOfBoundsException() {
    }

    public SetIndexOutOfBoundsException(String message) {
        super(message);
    }

    public SetIndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public SetIndexOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public SetIndexOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
