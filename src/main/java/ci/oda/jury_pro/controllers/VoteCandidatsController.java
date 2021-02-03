package ci.oda.jury_pro.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.VoteCandidats;

import ci.oda.jury_pro.services.VoteCandidatsService;

@RestController
public class VoteCandidatsController {

    @Autowired
    private VoteCandidatsService voteCandidatsService;

    @GetMapping("/voteCandidats")
    public List<VoteCandidats> getAll(){

        return voteCandidatsService.getAll();
    }

    @GetMapping("/voteCandidats/{voteCandidats_id}")
    public VoteCandidats getById(@PathVariable int voteCandidats_id){

        return voteCandidatsService.getById(voteCandidats_id);
    }


    @PostMapping("/voteCandidats")
    public Boolean createOrUpdate(@RequestBody VoteCandidats voteCandidats){

        // ResponseEntity<voteCandidatss> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        Boolean result = voteCandidatsService.createOrUpdate(voteCandidats);

        try {   
            if (!result) {
                throw new Exception();
            }

        } catch (Exception e) {
           
        }
        
        return result;
    }

    @PostMapping("/voteCandidats/delect")
    public Boolean delete(@RequestBody VoteCandidats voteCandidats) {
        Boolean result = voteCandidatsService.delete(voteCandidats);
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