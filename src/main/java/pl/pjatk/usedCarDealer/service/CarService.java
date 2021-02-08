package pl.pjatk.usedCarDealer.service;

import org.springframework.stereotype.Service;
import pl.pjatk.usedCarDealer.model.Car;
import pl.pjatk.usedCarDealer.repository.CarRepository;
import pl.pjatk.usedCarDealer.repository.ClientRepository;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;
    private final ClientRepository clientRepository;
    public CarService(CarRepository carRepository, ClientRepository clientRepository) {
        this.carRepository = carRepository;
        this.clientRepository = clientRepository;
    }
    public List<Car> findAll() {return carRepository.findAll();}
}
