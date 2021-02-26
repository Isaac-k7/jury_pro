package ci.oda.jury_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ci.oda.jury_pro.entities.Candidats;
import java.util.List;

@Repository
public interface CandidatsRepository extends JpaRepository<Candidats, Integer> {
    public List <Candidats> findByEvenementId(int evenementId);
    }
