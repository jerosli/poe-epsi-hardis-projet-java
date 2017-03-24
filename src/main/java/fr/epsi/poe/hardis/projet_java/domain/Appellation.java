package fr.epsi.poe.hardis.projet_java.domain;

import javax.persistence.Entity;
import javax.persistence.*;


/**
 * Created by medda on 21/03/2017.
 */
@Entity
public class Appellation extends AbstractEntity{

    @Column(length=40,nullable = false)
    private String nom;
    @ManyToOne
    private Region region;

    public Appellation(String nom, Region region) {
        this.nom = nom;
        this.region = region;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}


