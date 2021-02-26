package ci.oda.jury_pro.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Criteres;

import ci.oda.jury_pro.services.CriteresService;

@RestController
public class CriteresController {

    @Autowired
    private CriteresService criteresService;

    @GetMapping("/criteres")
    public List<Criteres> getAllEvenement() {

        return criteresService.getAll();
    }

    @GetMapping("/criteres/event/{id_event}")
    public List<Criteres> getAll(@PathVariable int id_event){

        return criteresService.getAllByEvent(id_event);
    }

    @GetMapping("/criteres/{critere_id}")
    public Criteres getById(@PathVariable int critere_id) {

        return criteresService.getById(critere_id);
    }


    @PostMapping("/criteres")
    public Boolean createOrUpdate(@RequestBody Criteres critere){

        // ResponseEntity<criteres> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        Boolean result = criteresService.createOrUpdate(critere);

        try {   
            if (!result) {
                throw new Exception();
            }

        } catch (Exception e) {
           
        }
        
        return result;
    }

    @PostMapping("/criteres/delect")
    public Boolean delete(@RequestBody Criteres critere) {
        Boolean result = criteresService.delete(critere);
        try {
            if (!result){
                throw new Exception();
            }
            // result = true;
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}