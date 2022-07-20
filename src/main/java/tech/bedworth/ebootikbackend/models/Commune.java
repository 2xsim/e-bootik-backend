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
public class Commune {

    @Id
    private Long id;

    private String nom;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Commune commune = (Commune) o;
        return id != null && Objects.equals(id, commune.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
