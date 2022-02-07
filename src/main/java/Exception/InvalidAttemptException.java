package Exception;

public class InvalidAttemptException extends RuntimeException {

  public InvalidAttemptException() {
    super();
  }

  public InvalidAttemptException(String message) {
    super(message);
  }
}


