package tech.bedworth.ebootikbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.bedworth.ebootikbackend.models.Commune;

@Repository
public interface CommuneRepository extends JpaRepository<Commune, Long> {
}