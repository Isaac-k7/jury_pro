package ci.oda.jury_pro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jury")
public class Jury {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jury_id;
    private int code_id;
    private String jury_nom_complet;
    private int jury_telephone;
    private String jury_email;
    private int evenement_id;

    public int getJury_id() {
        return jury_id;
    }

    public int getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public String getJury_email() {
        return jury_email;
    }

    public void setJury_email(String jury_email) {
        this.jury_email = jury_email;
    }

    public int getJury_telephone() {
        return jury_telephone;
    }

    public void setJury_telephone(int jury_telephone) {
        this.jury_telephone = jury_telephone;
    }

    public String getJury_nom_complet() {
        return jury_nom_complet;
    }

    public void setJury_nom_complet(String jury_nom_complet) {
        this.jury_nom_complet = jury_nom_complet;
    }

    public int getCode_id() {
        return code_id;
    }

    public void setCode_id(int code_id) {
        this.code_id = code_id;
    }

    public void setJury_id(int jury_id) {
        this.jury_id = jury_id;
    }

    public Jury() {
    }

}
