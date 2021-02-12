package pl.pjatk.demo.service;

import org.springframework.stereotype.Service;
import pl.pjatk.demo.exception.NotEmptyException;
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
    public Car findById(Long id){
        return carRepository.findById(id).orElseThrow(()->new CarException(id));
    }
    public Car addNewCar(Car car){
        if(car.getPrice()<=0 || car.getCarModel()==null || car.getOwner()<=0 ||car.getColor()==null||
                car.getEngineCapacity()==0.0 || car.getCarBrand()==null){
            throw new NotEmptyException(" Field ");
        }
        return carRepository.save(car);
    }

    public Car uptadeCar(Car changedCar,Long id){
        Car car = carRepository.findById(id).orElseThrow(()->new CarException(id));
        if(changedCar.getCarBrand()!=null){
            car.setCarBrand(changedCar.getCarBrand());
        }if(changedCar.getCarModel()!=null){
            car.setCarModel(changedCar.getCarModel());
        }if(changedCar.getColor()!=null){
            car.setColor(changedCar.getColor());
        }if(changedCar.getEngineCapacity()!=0.0){
            car.setEngineCapacity(changedCar.getEngineCapacity());
        }if(changedCar.getOwner()!=0){
            car.setOwner(changedCar.getOwner());
        }if(changedCar.getPrice()>=0){
            car.setPrice(changedCar.getPrice());
        }return carRepository.save(car);
    }



    }




