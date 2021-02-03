package ci.oda.jury_pro.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vote_candidats")
public class VoteCandidats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vote_candidat_id;
    private int jury_id;
    private int evenement_id;
    private int candidat_id;
    private int note;
    private String commentaires;

    public int getVote_candidat_id() {
        return vote_candidat_id;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
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

    public int getJury_id() {
        return jury_id;
    }

    public void setJury_id(int jury_id) {
        this.jury_id = jury_id;
    }

    public void setVote_candidat_id(int vote_candidat_id) {
        this.vote_candidat_id = vote_candidat_id;
    }

    public VoteCandidats() {
    }

}
