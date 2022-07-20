package tech.bedworth.ebootikbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bedworth.ebootikbackend.models.Franchise;
import tech.bedworth.ebootikbackend.repositories.FranchiseRepository;

import java.util.List;

@Service
public class FranchiseService {

    @Autowired
    private FranchiseRepository franchiseRepository;

    public Franchise readFranchise(Long idFranchise) {
        return franchiseRepository.findById(idFranchise).orElseThrow();
    }

    public List<Franchise> readAllFranchises() {
        return franchiseRepository.findAll();
    }

    public Franchise updateFranchise(Franchise franchise) {
        return franchiseRepository.save(franchise);
    }

}
