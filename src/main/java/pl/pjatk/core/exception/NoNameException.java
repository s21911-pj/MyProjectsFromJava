package pl.pjatk.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoNameException extends RuntimeException{
    public NoNameException(String message){
        super(message + "can't be empty");
    }
}
