package ci.oda.jury_pro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.entities.Evenement;
import ci.oda.jury_pro.services.EvenementsService;

@RestController
public class EvenementController {

    @Autowired
    private EvenementsService evenementService;

    @GetMapping("/evenements")
    public List<Evenement> getAllEvenement() {

        return evenementService.getAllEvenement();
    }

    @GetMapping("/evenements/{evenementId}")
    public Evenement getElementById(@PathVariable int evenement_id) {

        return evenementService.getElementById(evenement_id);

    }

    @PostMapping("/evenements")
    public ResponseEntity<?> createOrUpdateEvenement(@RequestBody Evenement evenement) {

        ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        try {
            if (!evenementService.createOrUpdateEvenement(evenement)) {
                throw new Exception();
            }

            result = new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {

        }

        return result;
    }

    @PostMapping("/evenements")
    public ResponseEntity<?> delete(@RequestBody Evenement evenement) {
        ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!evenementService.delete(evenement)) {
                throw new Exception();
            }
            result = new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }
}