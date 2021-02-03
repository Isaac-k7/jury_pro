package ci.oda.jury_pro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "groupes")

public class Groupes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupe_id;
    private int groupe_code;
    private String groupe_nom;
    private Byte[] groupe_photo;
    private int evenement_id;

    public int getGroupe_id() {
        return groupe_id;
    }

    public int getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public Byte[] getGroupe_photo() {
        return groupe_photo;
    }

    public void setGroupe_photo(Byte[] groupe_photo) {
        this.groupe_photo = groupe_photo;
    }

    public String getGroupe_nom() {
        return groupe_nom;
    }

    public void setGroupe_nom(String groupe_nom) {
        this.groupe_nom = groupe_nom;
    }

    public int getGroupe_code() {
        return groupe_code;
    }

    public void setGroupe_code(int groupe_code) {
        this.groupe_code = groupe_code;
    }

    public void setGroupe_id(int groupe_id) {
        this.groupe_id = groupe_id;
    }

    public Groupes() {
    }

}
