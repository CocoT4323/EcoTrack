package pe.edu.upc.ecotrack.dtos;

import java.time.LocalDateTime;

public class ControlesDTO {
    private int idControl;
    private String tipoControl;
    private String descripcion;
    private LocalDateTime fechaControl;
    private String ubicacion;

    public int getIdControl() {
        return idControl;
    }

    public void setIdControl(int idControl) {
        this.idControl = idControl;
    }

    public String getTipoControl() {
        return tipoControl;
    }

    public void setTipoControl(String tipoControl) {
        this.tipoControl = tipoControl;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(LocalDateTime fechaControl) {
        this.fechaControl = fechaControl;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
