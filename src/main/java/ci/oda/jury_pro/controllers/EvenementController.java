package ci.oda.jury_pro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
    private EvenementsService evenementsService;

    @GetMapping("/evenements")
    public List<Evenement> getAllEvenement() {

        return evenementsService.getAllEvenement();
    }

    @GetMapping("/evenements/{evenementId}")
    public Evenement getElementById(@PathVariable int evenementId){

        return evenementsService.getElementById(evenementId);
    }

    @PostMapping("/evenements")
    public Boolean createOrUpdateEvenement(@RequestBody Evenement evenement){

        return evenementsService.createOrUpdateEvenement(evenement);
    }

    @PostMapping("/evenements/delete/{id}")
    public String deleteEvenement(@PathVariable int id) {
        
        return evenementsService.deleteEvenement(id) ;
    }

}


