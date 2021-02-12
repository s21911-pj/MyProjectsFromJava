package pl.pjatk.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class NotEmptyException extends RuntimeException{
    public NotEmptyException(String message){super(message + "  cannot be empty");}
}
