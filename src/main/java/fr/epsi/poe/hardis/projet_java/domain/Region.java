package fr.epsi.poe.hardis.projet_java.domain;

/**
 * Created by VALE on 21/03/2017.
 */
public class Region {
    private long id;
    private String nom;

    public Region(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
