package ci.oda.jury_pro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ci.oda.jury_pro.entities.Groupes;
import ci.oda.jury_pro.repositories.GroupesRepository;
import java.util.List;

@Service
public class GroupesService {

    @Autowired
    private GroupesRepository groupesRepository;

    /*
     * Recuperation de la liste
     */
    public List<Groupes> getAll() {
        return groupesRepository.findAll();
    }

    /*
    * Recuperation par identifiant
    */
    public Groupes getById(Integer groupesId) {
        return groupesRepository.findById(groupesId).orElse(null);
    }

    /*
    * Creation ou mise a jour
    */
    public boolean createOrUpdate(Groupes groupe) {
        boolean result = false;
        try {
            if (groupe.getGroupe_id() > 0) {
                Groupes item = groupesRepository.getOne(groupe.getGroupe_id());
                // result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            groupesRepository.save(groupe);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    /*
    * Suppression
    */
    public boolean delete(Groupes groupe) {
        boolean result = false;
        Groupes item = groupesRepository.getOne(groupe.getGroupe_id());
        try {
            if (item == null) {
                throw new Exception();
            }
            groupesRepository.delete(groupe);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}