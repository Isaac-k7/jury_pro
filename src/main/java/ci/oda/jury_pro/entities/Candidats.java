package ci.oda.jury_pro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidats")
public class Candidats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int candidat_id;
    private int candidat_code;
    private String candidat_nom;
    private String candidat_prenom;
    private Byte[] candidat_photo;
    private String candidat_email;
    private int candidat_telephone;
    private int evenement_id;

    public int getCandidat_id() {
        return candidat_id;
    }

    public int getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public int getCandidat_telephone() {
        return candidat_telephone;
    }

    public void setCandidat_telephone(int candidat_telephone) {
        this.candidat_telephone = candidat_telephone;
    }

    public String getCandidat_email() {
        return candidat_email;
    }

    public void setCandidat_email(String candidat_email) {
        this.candidat_email = candidat_email;
    }

    public Byte[] getCandidat_photo() {
        return candidat_photo;
    }

    public void setCandidat_photo(Byte[] candidat_photo) {
        this.candidat_photo = candidat_photo;
    }

    public String getCandidat_prenom() {
        return candidat_prenom;
    }

    public void setCandidat_prenom(String candidat_prenom) {
        this.candidat_prenom = candidat_prenom;
    }

    public String getCandidat_nom() {
        return candidat_nom;
    }

    public void setCandidat_nom(String candidat_nom) {
        this.candidat_nom = candidat_nom;
    }

    public int getCandidat_code() {
        return candidat_code;
    }

    public void setCandidat_code(int candidat_code) {
        this.candidat_code = candidat_code;
    }

    public void setCandidat_id(int candidat_id) {
        this.candidat_id = candidat_id;
    }

    public Candidats() {
    }

}
