package tech.bedworth.ebootikbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.bedworth.ebootikbackend.models.Demande;
import tech.bedworth.ebootikbackend.services.DemandeService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class DemandeController {

    @Autowired
    private DemandeService demandeService;

    @GetMapping("demande")
    public Demande getDemande(@RequestParam Long id) {
        return demandeService.readDemande(id);
    }

    @GetMapping("/demandes")
    public List<Demande> getDemandes() {
        return demandeService.readAllDemandes();
    }

    @PostMapping("/demande")
    public Demande postDemande(Demande demande) {
        return demandeService.createDemande(demande);
    }
}
