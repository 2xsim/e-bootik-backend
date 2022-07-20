package tech.bedworth.ebootikbackend.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Produit {

    @Id
    private Long id;

    private String nom;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Produit produit = (Produit) o;
        return id != null && Objects.equals(id, produit.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
