package ci.oda.jury_pro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vote_groupes")
public class VotesGroupes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vote_groupe_id;
    private int jury_id;
    private int criteres_id;
    private int evenement_id;
    private int candidat_id;
    private Double note;
    private String commentaires;

    public int getVote_groupe_id() {
        return vote_groupe_id;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public int getCandidat_id() {
        return candidat_id;
    }

    public void setCandidat_id(int candidat_id) {
        this.candidat_id = candidat_id;
    }

    public int getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public int getCriteres_id() {
        return criteres_id;
    }

    public void setCriteres_id(int criteres_id) {
        this.criteres_id = criteres_id;
    }

    public int getJury_id() {
        return jury_id;
    }

    public void setJury_id(int jury_id) {
        this.jury_id = jury_id;
    }

    public void setVote_groupe_id(int vote_groupe_id) {
        this.vote_groupe_id = vote_groupe_id;
    }

    public VotesGroupes() {
    }

}
