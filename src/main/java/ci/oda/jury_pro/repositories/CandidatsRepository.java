package ci.oda.jury_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ci.oda.jury_pro.entities.Candidats;

public interface CandidatsRepository extends JpaRepository<Candidats, Integer> {

    }
