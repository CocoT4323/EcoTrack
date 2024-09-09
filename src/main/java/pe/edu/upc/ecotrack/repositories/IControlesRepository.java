package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Controles;
@Repository
public interface IControlesRepository extends JpaRepository<Controles, Integer> {
}
