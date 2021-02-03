package ci.oda.jury_pro.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.GroupeCandidats;

import ci.oda.jury_pro.services.GroupeCandidatsService;

@RestController
public class GroupeCandidatsController {

    @Autowired
    private GroupeCandidatsService groupeCandidatsService;

    @GetMapping("/groupeCandidats")
    public List<GroupeCandidats> getAll(){

        return groupeCandidatsService.getAll();
    }

    @GetMapping("/groupeCandidats/{groupeCandidats_id}")
    public GroupeCandidats getById(@PathVariable int groupeCandidats_id){

        return groupeCandidatsService.getById(groupeCandidats_id);
    }


    @PostMapping("/groupeCandidats")
    public Boolean createOrUpdate(@RequestBody GroupeCandidats groupeCandidats){

        // ResponseEntity<groupeCandidatss> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        Boolean result = groupeCandidatsService.createOrUpdate(groupeCandidats);

        try {   
            if (!result) {
                throw new Exception();
            }

        } catch (Exception e) {
           
        }
        
        return result;
    }

    @PostMapping("/groupeCandidats/delect")
    public Boolean delete(@RequestBody GroupeCandidats groupeCandidats) {
        Boolean result = groupeCandidatsService.delete(groupeCandidats);
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