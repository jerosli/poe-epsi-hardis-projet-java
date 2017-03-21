package fr.epsi.poe.hardis.projet_java.domain;

import javax.persistence.Entity;

/**
 * Created by VALE on 21/03/2017.
 */
@Entity
public class Region extends AbstractEntity{
    private String nom;

    public Region(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
