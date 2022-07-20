package tech.bedworth.ebootikbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.bedworth.ebootikbackend.models.Franchise;
import tech.bedworth.ebootikbackend.services.FranchiseService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class FranchiseController {

    @Autowired
    private FranchiseService franchiseService;

    @GetMapping("/franchise")
    public Franchise getFranchise(@RequestParam Long id) {
        return franchiseService.readFranchise(id);
    }

    @GetMapping("/franchises")
    public List<Franchise> getFranchises() {
        return franchiseService.readAllFranchises();
    }

    @PostMapping("/franchise")
    public Franchise postFranchise(Franchise franchise) {
        return franchiseService.updateFranchise(franchise);
    }

}
