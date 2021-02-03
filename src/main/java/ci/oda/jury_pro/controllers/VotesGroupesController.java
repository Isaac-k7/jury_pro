package ci.oda.jury_pro.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.VotesGroupes;

import ci.oda.jury_pro.services.VotesGroupesService;

@RestController
public class VotesGroupesController {

    @Autowired
    private VotesGroupesService votesGroupesService;

    @GetMapping("/votesGroupes")
    public List<VotesGroupes> getAll(){

        return votesGroupesService.getAll();
    }

    @GetMapping("/votesGroupes/{votesGroupes_id}")
    public VotesGroupes getById(@PathVariable int votesGroupes_id){

        return votesGroupesService.getById(votesGroupes_id);
    }


    @PostMapping("/votesGroupes")
    public Boolean createOrUpdate(@RequestBody VotesGroupes votesGroupes){

        // ResponseEntity<votesGroupess> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        Boolean result = votesGroupesService.createOrUpdate(votesGroupes);

        try {   
            if (!result) {
                throw new Exception();
            }

        } catch (Exception e) {
           
        }
        
        return result;
    }

    @PostMapping("/votesGroupes/delect")
    public Boolean delete(@RequestBody VotesGroupes votesGroupes) {
        Boolean result = votesGroupesService.delete(votesGroupes);
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