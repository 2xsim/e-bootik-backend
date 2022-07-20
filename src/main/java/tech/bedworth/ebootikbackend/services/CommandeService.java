package tech.bedworth.ebootikbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bedworth.ebootikbackend.repositories.CommandeRepository;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

}
