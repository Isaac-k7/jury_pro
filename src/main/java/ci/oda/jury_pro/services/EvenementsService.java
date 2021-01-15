package ci.oda.jury_pro.services;

import ci.oda.jury_pro.entities.Evenement;
import ci.oda.jury_pro.repositories.EvenementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EvenementsService{

    @Autowired
    private EvenementsRepository evenementsRepository;

    public List<Evenement>getAllEvenement(){  

        return evenementsRepository.findAll();
    }
    public Evenement getElementById(int evenementId){
                 
		return evenementsRepository.getOne(evenementId);
    }

    public boolean createOrUpdateEvenement(Evenement evenement){

        Boolean result = false;
        try{
            if(evenement.getId()>0){
                Evenement item = evenementsRepository.getOne(evenement.getId());
                if (item==null){
                    throw new Exception("Evenement not found with id  : "+ evenement.getId());
                }
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return result; 
    }

    public boolean delete(Evenement evenement) {
        boolean result = false;
        try {
            if (evenement.getId() > 1) {
                throw new Exception();
            }
            Evenement item = evenementsRepository.getOne(evenement.getId());
            if (item == null) {
                throw new Exception();
            }
            evenementsRepository.delete(evenement);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

}
