package ci.oda.jury_pro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ci.oda.jury_pro.entities.VotesGroupes;
import ci.oda.jury_pro.repositories.VotesGroupesRepository;
import java.util.List;

@Service
public class VotesGroupesService {

    @Autowired
    private VotesGroupesRepository votesGroupesRepository;

    /*
     * Recuperation de la liste
     */
    public List<VotesGroupes> getAll() {
        return votesGroupesRepository.findAll();
    }

    /*
    * Recuperation par identifiant
    */
    public VotesGroupes getById(Integer votesGroupesId) {
        return votesGroupesRepository.findById(votesGroupesId).orElse(null);
    }

    /*
    * Creation ou mise a jour
    */
    public boolean createOrUpdate(VotesGroupes votesGroupes) {
        boolean result = false;
        try {
            if (votesGroupes.getVote_groupe_id() > 0) {
                VotesGroupes item = votesGroupesRepository.getOne(votesGroupes.getVote_groupe_id());
                // result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            votesGroupesRepository.save(votesGroupes);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    /*
    * Suppression
    */
    public boolean delete(VotesGroupes votesGroupes) {
        boolean result = false;
        VotesGroupes item = votesGroupesRepository.getOne(votesGroupes.getVote_groupe_id());
        try {
            if (item == null) {
                throw new Exception();
            }
            votesGroupesRepository.delete(votesGroupes);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}