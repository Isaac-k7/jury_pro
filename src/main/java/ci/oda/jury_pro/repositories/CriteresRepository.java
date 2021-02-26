package ci.oda.jury_pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ci.oda.jury_pro.entities.Criteres;
import java.util.List;

@Repository
public interface CriteresRepository extends JpaRepository<Criteres, Integer> {
    public List <Criteres> findByEvenementId(int evenementId);
    }
