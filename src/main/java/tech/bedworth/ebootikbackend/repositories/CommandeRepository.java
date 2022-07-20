package tech.bedworth.ebootikbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.bedworth.ebootikbackend.models.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
}