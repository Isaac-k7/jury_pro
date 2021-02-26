package ci.oda.jury_pro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "criteres")
public class Criteres {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int criteres_id;
    private String criteres_libelle;
    private Double candidat_bareme;
    private String detail;
    private int evenementId;

    public int getCriteres_id() {
        return criteres_id;
    }

    public int getevenementId() {
        return evenementId;
    }

    public void setevenementId(int evenementId) {
        this.evenementId = evenementId;
    }

    public Double getCandidat_bareme() {
        return candidat_bareme;
    }

    public void setCandidat_bareme(Double candidat_bareme) {
        this.candidat_bareme = candidat_bareme;
    }

    public String getCriteres_libelle() {
        return criteres_libelle;
    }

    public void setCriteres_libelle(String criteres_libelle) {
        this.criteres_libelle = criteres_libelle;
    }

    public void setCriteres_id(int criteres_id) {
        this.criteres_id = criteres_id;
    }
    public String getDetail() {
        return detail;
    }
    public void  setDetail(String detail) {
        this.detail = detail; 
    }

}
