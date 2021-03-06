/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEntretien.Bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author lenovo
 */
@Entity
public class PresBonCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    protected double numeroBonCommande;
    protected Date dateBonCommande;
    protected double montant;
    protected String nomPrestataire;
    
    @OneToOne
    private PrestationExterne prestationExterne;

    public double getNumeroBonCommande() {
        return numeroBonCommande;
    }

    public void setNumeroBonCommande(double numeroBonCommande) {
        this.numeroBonCommande = numeroBonCommande;
    }

    public Date getDateBonCommande() {
        return dateBonCommande;
    }

    public void setDateBonCommande(Date dateBonCommande) {
        this.dateBonCommande = dateBonCommande;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getNomPrestataire() {
        return nomPrestataire;
    }

    public void setNomPrestataire(String nomPrestataire) {
        this.nomPrestataire = nomPrestataire;
    }
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresBonCommande)) {
            return false;
        }
        PresBonCommande other = (PresBonCommande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GestionEntretien.Bean.PresBonCommande[ id=" + id + " ]";
    }
    
}
