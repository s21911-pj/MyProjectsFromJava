package pl.pjatk.demo.service;

import org.springframework.stereotype.Service;
import pl.pjatk.demo.exception.ClientNotFoundException;
import pl.pjatk.demo.exception.NotEmptyException;
import pl.pjatk.demo.model.Client;
import pl.pjatk.demo.repository.CarRepository;
import pl.pjatk.demo.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    private final CarRepository carRepository;
    private final ClientRepository clientRepository;

    public ClientService(CarRepository carRepository, ClientRepository clientRepository) {
        this.carRepository = carRepository;
        this.clientRepository = clientRepository;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow(() -> new ClientNotFoundException(id));
    }

    public Client addNewClient(Client client) {
        if (client.getMoney() == 0 || client.getName() == null || client.getSurname() == null) {
            throw new NotEmptyException("Field");
        }
        return clientRepository.save(client);
    }

}
