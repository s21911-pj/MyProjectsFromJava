package pl.pjatk.usedCarDealer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CarException extends RuntimeException{
    public CarException(Long message){super(message + "we don't have car in this color");}
}
