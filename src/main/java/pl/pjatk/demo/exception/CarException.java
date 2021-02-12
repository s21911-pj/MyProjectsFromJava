package pl.pjatk.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarException  extends RuntimeException{
    public CarException(Long message){super(message + "we don't have this car");}
}

