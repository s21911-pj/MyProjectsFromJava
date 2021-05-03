package pl.pjatk.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentException extends RuntimeException {
    public StudentException(Long message){
        super (message + "not found");
    }

}
