package pl.pjatk.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.demo.model.Client;
import pl.pjatk.demo.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/getAllClients")
    public ResponseEntity<List<Client>> findAllClients (){
        return ResponseEntity.status(HttpStatus.OK).body(clientService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body((clientService.findById(id)));
    }
    @PutMapping
}
