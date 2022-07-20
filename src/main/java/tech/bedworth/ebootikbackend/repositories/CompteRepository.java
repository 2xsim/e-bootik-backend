package tech.bedworth.ebootikbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.bedworth.ebootikbackend.models.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}