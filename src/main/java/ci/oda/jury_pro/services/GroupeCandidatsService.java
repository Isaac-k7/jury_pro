package ci.oda.jury_pro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ci.oda.jury_pro.entities.GroupeCandidats;
import ci.oda.jury_pro.repositories.GroupeCandidatsRepository;
import java.util.List;

@Service
public class GroupeCandidatsService {

    @Autowired
    private GroupeCandidatsRepository groupeCandidatsRepository;

    /*
     * Recuperation de la liste
     */
    public List<GroupeCandidats> getAll() {
        return groupeCandidatsRepository.findAll();
    }

    /*
    * Recuperation par identifiant
    */
    public GroupeCandidats getById(Integer groupeCandidatsId) {
        return groupeCandidatsRepository.findById(groupeCandidatsId).orElse(null);
    }

    /*
    * Creation ou mise a jour
    */
    public boolean createOrUpdate(GroupeCandidats groupeCandidats) {
        boolean result = false;
        try {
            if (groupeCandidats.getGroupe_candidat_id() > 0) {
                GroupeCandidats item = groupeCandidatsRepository.getOne(groupeCandidats.getGroupe_candidat_id());
                // result = true;
                if (item == null) {
                    throw new Exception();
                }
            }
            groupeCandidatsRepository.save(groupeCandidats);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    /*
    * Suppression
    */
    public boolean delete(GroupeCandidats groupeCandidats) {
        boolean result = false;
        GroupeCandidats item = groupeCandidatsRepository.getOne(groupeCandidats.getGroupe_candidat_id());
        try {
            if (item == null) {
                throw new Exception();
            }
            groupeCandidatsRepository.delete(groupeCandidats);
            result = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}