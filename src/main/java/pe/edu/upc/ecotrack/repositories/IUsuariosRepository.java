package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Usuarios;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer> {
    @Query(value="Select \n" +
            "\tu.nombre,\n" +
            "\tpa.id_pagos,\n" +
            "\tpa.monto,\n" +
            "\tpa.fecha_pago,\n" +
            "\tpa.estado\n" +
            "From\n" +
            "\tusuarios u\n" +
            "Inner Join\n" +
            "\tcotizaciones co on u.id_usuarios = co.id_usuarios\n" +
            "Inner Join \n" +
            "\tpagos pa on co.id_cotizaciones = pa.id_cotizaciones\n" +
            "Where\n" +
            "\tu.nombre = :nombre\n" +
            "Order by\n" +
            "\tpa.monto;",nativeQuery = true)
    public List<String[]> reporteAgricultorVerPagos(@Param("nombre") String nombre);
}
