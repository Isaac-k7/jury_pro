package ci.oda.jury_pro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ci.oda.jury_pro.entities.Jury;
import ci.oda.jury_pro.repositories.JuryRepository;
import java.util.List;

@Service
public class JuryService {

    @Autowired
    private JuryRepository juryRepository;

    /*
     * Recuperation de la liste
     */
    public List<Jury> getAll() {
        return juryRepository.findAll();
    }

    /*
    * Recuperation par identifiant
    */
    public Jury getById(Integer juryId) {
        return juryRepository.findById(juryId).orElse(null);
    }

    /*
    * Creation ou mise a jour
    */
    public boolean createOrUpdate(Jury jury) {
        boolean result = false;
        try {
            if (jury.getJury_id() > 0) {
                Jury item = juryRepository.getOne(jury.getJury_id());
                // result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            juryRepository.save(jury);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    /*
    * Suppression
    */
    public boolean delete(Jury jury) {
        boolean result = false;
        Jury item = juryRepository.getOne(jury.getJury_id());
        try {
            if (item == null) {
                throw new Exception();
            }
            juryRepository.delete(jury);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}