package pl.pjatk.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.core.Car;

@RestController
@RequestMapping("/test")
public class PojoController {


    @GetMapping("/Hello")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        Car vw = new Car(1,"sddsa",2);
        return ResponseEntity.ok(vw);
    }
    @PostMapping("/model")
    public ResponseEntity<Car> getCarPost(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }




}
