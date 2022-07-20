package tech.bedworth.ebootikbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.bedworth.ebootikbackend.models.Demande;
import tech.bedworth.ebootikbackend.repositories.DemandeRepository;

import java.util.List;

@Service
public class DemandeService {

    @Autowired
    private DemandeRepository demandeRepository;

    public Demande createDemande(Demande demande) {
        return demandeRepository.save(demande);
    }

    public Demande readDemande(Long idDemande) {
        return demandeRepository.findById(idDemande).orElseThrow();
    }

    public List<Demande> readAllDemandes() {
        return demandeRepository.findAll();
    }

    public Demande updateDemande(Demande demande) {
        return demandeRepository.save(demande);
    }

    public void deleteDemande(Long idDemande) {
        demandeRepository.delete(readDemande(idDemande));
    }

}
