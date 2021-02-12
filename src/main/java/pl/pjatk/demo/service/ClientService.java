package pl.pjatk.demo.service;

import org.springframework.stereotype.Service;
import pl.pjatk.demo.model.Client;
import pl.pjatk.demo.repository.CarRepository;
import pl.pjatk.demo.repository.ClientRepository;

@Service
public class ClientService {

    private final CarRepository carRepository;
    private final ClientRepository clientRepository;
    public ClientService(CarRepository carRepository, ClientRepository clientRepository) {
        this.carRepository = carRepository;
        this.clientRepository = clientRepository;
    }

    public Client

}
