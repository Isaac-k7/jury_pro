package ci.oda.jury_pro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ci.oda.jury_pro.entities.Candidats;
import ci.oda.jury_pro.repositories.CandidatsRepository;
import java.util.List;

@Service
public class CandidatsService {

    @Autowired
    private CandidatsRepository candidatRepository;

    /*
     * Recuperation de la liste
     */
    public List<Candidats> getAll() {
        return candidatRepository.findAll();
    }

    /*
    * Recuperation par identifiant
    */
    public Candidats getById(int candidat_id) {
        return candidatRepository.findById(candidat_id).orElse(null);
    }

    /*
    * Creation ou mise a jour
    */
    public boolean createOrUpdate(Candidats candidat) {
        boolean result = false;
        try {
            if (candidat.getCandidat_id() > 0) {
                Candidats item = candidatRepository.getOne(candidat.getCandidat_id());
                // result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            candidatRepository.save(candidat);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    /*
    * Suppression
    */
    public boolean delete(Candidats candidat) {
        boolean result = false;
        Candidats item = candidatRepository.getOne(candidat.getCandidat_id());

        try {
            if (item == null) {
                throw new Exception();
            }
            candidatRepository.delete(candidat);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}