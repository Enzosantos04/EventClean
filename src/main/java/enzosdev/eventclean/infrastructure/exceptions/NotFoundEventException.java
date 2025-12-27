package enzosdev.eventclean.infrastructure.exceptions;

public class NotFoundEventException extends RuntimeException {
  public NotFoundEventException(String message) {
    super(message);
  }
}
