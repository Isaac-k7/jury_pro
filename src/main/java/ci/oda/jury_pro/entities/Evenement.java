package ci.oda.jury_pro.entities;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.*;

 @Entity
 @Table(name = "evenement")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nom", length=20)
    private String nom;

    @Column(name="type", length = 50)
    private String type;

    @Column(name="dateDebut", length=15)
    private String dateDebut;

    @Column(name="dateFin", length=15)
    private String dateFin;

    @Column(name="images")
    private Blob images;

    public Integer getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public String getNom() {
        return nom;
    }
    public String getDateDebut() {
        return dateDebut;
    }
    public String getDateFin() {
        return dateFin;
    }
    public Blob getImages(){
        return images;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setDateDebut(String dateDebut){
        this.dateDebut = dateDebut;
    }
    public void setDateFisn(String dateFin){
        this.dateFin = dateFin;
    }
    public void setImage(Blob image){
        this.images = image;
    }

}
    
  