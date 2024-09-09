package pe.edu.upc.ecotrack.dtos;

import pe.edu.upc.ecotrack.entities.Usuarios;

import java.time.LocalDateTime;

public class CotizacionesDTO {
    private int idCotizaciones;
    private double precio;
    private LocalDateTime fechaCotizacion;
    private Usuarios usuario;

    public int getIdCotizaciones() {
        return idCotizaciones;
    }

    public void setIdCotizaciones(int idCotizaciones) {
        this.idCotizaciones = idCotizaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFechaCotizacion() {
        return fechaCotizacion;
    }

    public void setFechaCotizacion(LocalDateTime fechaCotizacion) {
        this.fechaCotizacion = fechaCotizacion;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
