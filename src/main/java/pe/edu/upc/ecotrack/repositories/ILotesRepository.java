package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Lotes;
@Repository
public interface ILotesRepository extends JpaRepository<Lotes,Integer> {
}
