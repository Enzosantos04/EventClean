package enzosdev.eventclean.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(DuplicateIdentifierException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public String handleDuplicateIdentifier(DuplicateIdentifierException ex){
        return ex.getMessage();
    }
}
