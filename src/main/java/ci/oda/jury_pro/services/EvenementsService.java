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
                 
		return evenementsRepository.findById(evenementId).orElse(null);
    }


    public boolean createOrUpdateEvenement(Evenement evenement){
        Boolean result = false;
        try{
            if(evenement.getId() != null){
                if(evenement.getId() > 0){
                    Evenement item = evenementsRepository.getOne(evenement.getId());
                    if(item == null){
                        throw new Exception();    
                    }
                }
            }
            evenementsRepository.save(evenement);
            result = true;
        }
        catch(Exception e){
            System.out.println("");
        }
        return result; 
    }
    

    public String deleteEvenement(int id){
        Evenement item = evenementsRepository.getOne(id);
        String result = "Echec suppression";
        try {
            if(item != null){
                evenementsRepository.deleteById(id);
                result = "Suppresion reussi";
            }
            else{
                throw new Exception("Cet evenement est introuvable");
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }     
        return result;
    }
}
