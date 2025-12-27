package enzosdev.eventclean.infrastructure.exceptions;

public class DuplicateIdentifierException extends RuntimeException {
    public DuplicateIdentifierException(String message) {
        super(message);
    }
}
