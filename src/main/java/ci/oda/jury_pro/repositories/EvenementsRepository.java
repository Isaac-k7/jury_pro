package ci.oda.jury_pro.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import ci.oda.jury_pro.entities.Evenement;


public interface EvenementsRepository extends JpaRepository <Evenement, Integer>{

}

// public interface EvenementsRepository extends CrudRepository<Evenement, Integer>{

// }