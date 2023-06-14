package pro.sky.CourseWork2.exceptions;


public class AllreadyContainsException extends RuntimeException {
    public AllreadyContainsException() {
    }

    public AllreadyContainsException(String message) {
        super(message);
    }
}
