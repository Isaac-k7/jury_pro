package ci.oda.jury_pro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ci.oda.jury_pro.entities.VoteCandidats;
import ci.oda.jury_pro.repositories.VoteCandidatsRepository;
import java.util.List;

@Service
public class VoteCandidatsService {

    @Autowired
    private VoteCandidatsRepository voteCandidatsRepository;

    /*
     * Recuperation de la liste
     */
    public List<VoteCandidats> getAll() {
        return voteCandidatsRepository.findAll();
    }

    /*
    * Recuperation par identifiant
    */
    public VoteCandidats getById(Integer voteCandidatsId) {
        return voteCandidatsRepository.findById(voteCandidatsId).orElse(null);
    }

    /*
    * Creation ou mise a jour
    */
    public boolean createOrUpdate(VoteCandidats voteCandidats) {
        boolean result = false;
        try {
            if (voteCandidats.getVote_candidat_id() > 0) {
                VoteCandidats item = voteCandidatsRepository.getOne(voteCandidats.getVote_candidat_id());
                // result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            voteCandidatsRepository.save(voteCandidats);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    /*
    * Suppression
    */
    public boolean delete(VoteCandidats voteCandidats) {
        boolean result = false;
        VoteCandidats item = voteCandidatsRepository.getOne(voteCandidats.getVote_candidat_id());
        try {
            if (item == null) {
                throw new Exception();
            }
            voteCandidatsRepository.delete(voteCandidats);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}