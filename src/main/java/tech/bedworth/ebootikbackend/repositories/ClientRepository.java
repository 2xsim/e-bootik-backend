package tech.bedworth.ebootikbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.bedworth.ebootikbackend.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}