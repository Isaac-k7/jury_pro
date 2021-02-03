package ci.oda.jury_pro.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Jury;

import ci.oda.jury_pro.services.JuryService;

@RestController
public class JuryController {

    @Autowired
    private JuryService juryService;

    @GetMapping("/jury")
    public List<Jury> getAll(){

        return juryService.getAll();
    }

    @GetMapping("/jury/{jury_id}")
    public Jury getById(@PathVariable int jury_id){

        return juryService.getById(jury_id);
    }


    @PostMapping("/jury")
    public Boolean createOrUpdate(@RequestBody Jury jury){

        // ResponseEntity<jurys> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        Boolean result = juryService.createOrUpdate(jury);

        try {   
            if (!result) {
                throw new Exception();
            }

        } catch (Exception e) {
           
        }
        
        return result;
    }

    @PostMapping("/jury/delect")
    public Boolean delete(@RequestBody Jury jury) {
        Boolean result = juryService.delete(jury);
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