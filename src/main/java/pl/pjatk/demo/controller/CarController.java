package pl.pjatk.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.demo.model.Car;
import pl.pjatk.demo.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getAllCars")
    public ResponseEntity<List<Car>> findAllCars() {
        return ResponseEntity.status(HttpStatus.OK).body(carService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(carService.findById(id));
    }

    @PostMapping("/newCar")
    public ResponseEntity<Car> addNewCar(@RequestBody Car car) {

        return ResponseEntity.ok(carService.addNewCar(car));
    }

    @PutMapping("/uptade")
    public ResponseEntity<Car> uptadeCar(@RequestBody Car car, @PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(carService.uptadeCar(car, id));
    }
}
