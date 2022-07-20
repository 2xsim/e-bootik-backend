package tech.bedworth.ebootikbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bedworth.ebootikbackend.models.Client;
import tech.bedworth.ebootikbackend.repositories.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client readClient(Long idClient) {
        return clientRepository.findById(idClient).orElseThrow();
    }

    public List<Client> readAllClients() {
        return clientRepository.findAll();
    }

    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(Long idClient) {
        clientRepository.delete(readClient(idClient));
    }

}
