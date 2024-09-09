package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.ecotrack.entities.Reportes;

public interface IReportesRepository extends JpaRepository<Reportes,Integer> {
}
