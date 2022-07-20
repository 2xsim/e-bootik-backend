package tech.bedworth.ebootikbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.bedworth.ebootikbackend.models.Client;
import tech.bedworth.ebootikbackend.services.ClientService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/client")
    public Client getClient(@RequestParam Long id) {
        return clientService.readClient(id);
    }

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientService.readAllClients();
    }

    @PostMapping("/client")
    public Client postClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

}
