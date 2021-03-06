package ci.oda.jury_pro.entities;

import java.util.Date;
//import javax.persistence.*;

// @Entity
// @TAble(name = "evenement")
public class Evenement {

    private int id;
    private String nom;
    private String type;
    private Date dateDebut;
    private Date dateFin;

    public Evenement(int id, String type, String nom, Date dateDebut, Date dateFin) {
 }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setId(int id) {
        this.id = id;
    }

    //@Override
    //public String toString() {
        //return getId() + " " + getNom() + " " + getType() + " " + getDateDebut() + " " + getDateFin();
    //}
}
