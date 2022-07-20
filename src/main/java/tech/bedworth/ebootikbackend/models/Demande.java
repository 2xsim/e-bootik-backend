package tech.bedworth.ebootikbackend.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Demande {

    @Id
    @GeneratedValue
    private Long id;

    private String nomProprietaire;

    private String prenomsProprietaire;

    private Date dateDeNaissance;

    private String nationnaliteProprietaire;

    private String numeroTelephoneProprietaire;

    private String adresseProprietaire;

    private String emailProprietaire;

    private String typePieceProprietaire;

    private String pieceProprietaire;

    private String nomFranchise;

    private String numeroTelephoneFranchise;

    private String villeFranchise;

    private String communeFranchise;

    private String immatriculationRCCM;

    private String extraitRCCM;

    private String NCC;

    private String nomBanque;

    private String numeroCompteBancaire;

    private String numeroCompteMobileMoney;

    private String statutDemande;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Demande demande = (Demande) o;
        return id != null && Objects.equals(id, demande.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
