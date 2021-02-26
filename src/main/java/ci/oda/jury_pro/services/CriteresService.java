package ci.oda.jury_pro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ci.oda.jury_pro.entities.Criteres;
import ci.oda.jury_pro.repositories.CriteresRepository;
import java.util.List;

@Service
public class CriteresService {

    @Autowired
    private CriteresRepository critereRepository;

    /*
     * Recuperation de la liste
     */
    public List<Criteres> getAll() {
        return critereRepository.findAll();
    }
    public List<Criteres> getAllByEvent(int id_event) {
        return critereRepository.findByEvenementId(id_event);
    }
    /*
    * Recuperation par identifiant
    */
    public Criteres getById(int critereId) {
        return critereRepository.findById(critereId).orElse(null);
    }

    /*
    * Creation ou mise a jour
    */
    public boolean createOrUpdate(Criteres critere) {
        boolean result = false;
        try {
            if (critere.getCriteres_id() > 0) {
                Criteres item = critereRepository.getOne(critere.getCriteres_id());
                // result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            critereRepository.save(critere);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    /*
    * Suppression
    */
    public boolean delete(Criteres critere) {
        boolean result = false;
        Criteres item = critereRepository.getOne(critere.getCriteres_id());
        try {
            if (item == null) {
                throw new Exception();
            }
            critereRepository.delete(critere);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}