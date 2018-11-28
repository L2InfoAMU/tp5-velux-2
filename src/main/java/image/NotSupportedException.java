package image;

public class NotSupportedException extends RuntimeException {
    String exception;
    public NotSupportedException(String exception){
        this.exception = exception;
    }
}
