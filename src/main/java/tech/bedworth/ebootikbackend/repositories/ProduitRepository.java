package tech.bedworth.ebootikbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.bedworth.ebootikbackend.models.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}