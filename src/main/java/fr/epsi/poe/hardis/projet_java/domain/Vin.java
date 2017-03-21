package fr.epsi.poe.hardis.projet_java.domain;

/**
 * Projet : cave_a_vins
 * Créé par jerome le 21/03/17.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class Vin extends AbstractEntity{

    // CHAMPS
    @Column
    private String complementNom;
    @Column
    private Couleur couleur;
    @Column
    private String producteur;
    @Column
    private String cru;
    @ManyToOne
    private Appellation appellation;
    @Column
    private int millésime;
    @ManyToMany
    private Set<Cepage> cépage;

    // CONSTRUCTEURS

    public Vin(Long id, String complementNom, Couleur couleur, String producteur, String cru, int millésime) {
        this.id = id;
        this.complementNom = complementNom;
        this.couleur = couleur;
        this.producteur = producteur;
        this.cru = cru;
        this.millésime = millésime;
    }

    // ACCESSEURS ET MUTATEURS

    public String getComplementNom() {
        return complementNom;
    }

    public void setComplementNom(String complementNom) {
        this.complementNom = complementNom;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public String getProducteur() {
        return producteur;
    }

    public void setProducteur(String producteur) {
        this.producteur = producteur;
    }

    public String getCru() {
        return cru;
    }

    public void setCru(String cru) {
        this.cru = cru;
    }

    public int getMillésime() {
        return millésime;
    }

    public void setMillésime(int millésime) {
        this.millésime = millésime;
    }
}
