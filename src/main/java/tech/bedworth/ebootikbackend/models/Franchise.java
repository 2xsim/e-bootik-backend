package tech.bedworth.ebootikbackend.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Franchise extends Compte {

    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Franchise franchise = (Franchise) o;
        return getId() != null && Objects.equals(getId(), franchise.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}