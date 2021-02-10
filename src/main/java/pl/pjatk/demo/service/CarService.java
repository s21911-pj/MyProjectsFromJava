package pl.pjatk.demo.service;

import org.springframework.stereotype.Service;
import pl.pjatk.demo.exception.CarException;
import pl.pjatk.demo.model.Car;
import pl.pjatk.demo.repository.CarRepository;
import pl.pjatk.demo.repository.ClientRepository;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;
    private final ClientRepository clientRepository;
    public CarService(CarRepository carRepository, ClientRepository clientRepository) {
        this.carRepository = carRepository;
        this.clientRepository = clientRepository;
    }

    public List<Car> findAll(){return carRepository.findAll();
    }
    public Car findyById(Long id){
        return carRepository.findById(id).orElseThrow(()->new CarException(id));
    }
    public Car addNewCar(Car car){
        return carRepository.save(car);
    }
}


