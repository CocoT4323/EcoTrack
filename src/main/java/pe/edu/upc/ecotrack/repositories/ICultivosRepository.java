package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Cultivos;

import java.util.List;

@Repository
public interface ICultivosRepository extends JpaRepository<Cultivos, Integer> {
    @Query(value = "select id_cultivos,tipo from cultivos c where c.nombre like nombre",nativeQuery = true)
    public List<String[]> buscarNombre(@Param("nombre")String nombre);
}
