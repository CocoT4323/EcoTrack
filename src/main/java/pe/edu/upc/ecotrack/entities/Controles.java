package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Controles")
public class Controles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idControles;

    @Column(name = "tipo_control", nullable = false, length = 100)
    private String tipoControl;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "fecha_control", nullable = false)
    private LocalDateTime fechaControl;

    @Column(name = "ubicacion", nullable = false, length = 255)
    private String ubicacion;

    public Controles() {
    }

    public Controles(int idControles, String tipoControl, String descripcion, LocalDateTime fechaControl, String ubicacion) {
        this.idControles = idControles;
        this.tipoControl = tipoControl;
        this.descripcion = descripcion;
        this.fechaControl = fechaControl;
        this.ubicacion = ubicacion;
    }

    public int getIdControles() {
        return idControles;
    }

    public void setIdControles(int idControles) {
        this.idControles = idControles;
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
