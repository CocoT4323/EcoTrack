package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Cultivos;
@Repository
public interface ICultivosRepository extends JpaRepository<Cultivos, Integer> {
}
