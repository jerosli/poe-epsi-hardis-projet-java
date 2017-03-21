package fr.epsi.poe.hardis.projet_java.domain;

import javax.persistence.Entity;
import com.sun.istack.internal.NotNull;
import javax.persistence.*;


/**
 * Created by medda on 21/03/2017.
 */
@Entity
public class Appellation extends AbstractEntity{
    @NotNull
    @Column(length=40)
    private String nom;
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


