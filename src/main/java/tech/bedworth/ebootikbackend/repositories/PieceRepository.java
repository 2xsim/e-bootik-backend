package tech.bedworth.ebootikbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.bedworth.ebootikbackend.models.Piece;

@Repository
public interface PieceRepository extends JpaRepository<Piece, Long> {
}