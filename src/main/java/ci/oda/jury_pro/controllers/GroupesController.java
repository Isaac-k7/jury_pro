package ci.oda.jury_pro.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Groupes;

import ci.oda.jury_pro.services.GroupesService;

@RestController
public class GroupesController {

    @Autowired
    private GroupesService groupesService;

    @GetMapping("/groupes")
    public List<Groupes> getAll(){

        return groupesService.getAll();
    }

    @GetMapping("/groupes/{groupes_id}")
    public Groupes getById(@PathVariable int groupes_id){

        return groupesService.getById(groupes_id);
    }


    @PostMapping("/groupes")
    public Boolean createOrUpdate(@RequestBody Groupes groupes){

        // ResponseEntity<groupess> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        Boolean result = groupesService.createOrUpdate(groupes);

        try {   
            if (!result) {
                throw new Exception();
            }

        } catch (Exception e) {
           
        }
        
        return result;
    }

    @PostMapping("/groupes/delect")
    public Boolean delete(@RequestBody Groupes groupes) {
        Boolean result = groupesService.delete(groupes);
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