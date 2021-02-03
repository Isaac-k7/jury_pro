package ci.oda.jury_pro.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Candidats;

import ci.oda.jury_pro.services.CandidatsService;

@RestController
public class CandidatsController {

    @Autowired
    private CandidatsService candidatsService;

    @GetMapping("/candidats")
    public List<Candidats> getAll(){

        return candidatsService.getAll();
    }

    @GetMapping("/candidats/{candidats_id}")
    public Candidats getById(@PathVariable int candidats_id){

        return candidatsService.getById(candidats_id);
    }


    @PostMapping("/candidats")
    public Boolean createOrUpdate(@RequestBody Candidats candidats){

        // ResponseEntity<candidatss> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        Boolean result = candidatsService.createOrUpdate(candidats);

        try {   
            if (!result) {
                throw new Exception();
            }

        } catch (Exception e) {
           
        }
        
        return result;
    }

    @PostMapping("/candidats/delect")
    public Boolean delete(@RequestBody Candidats candidats) {
        Boolean result = candidatsService.delete(candidats);
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