package tech.bedworth.ebootikbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.bedworth.ebootikbackend.models.Franchise;

@Repository
public interface FranchiseRepository extends JpaRepository<Franchise, Long> {
}