package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Lotes")
public class Lotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLotes;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "tipo_cultivo", nullable = false, length = 100)
    private String tipoCultivo;

    @Column(name = "fecha_siembra", nullable = false, length = 20)
    private String fechaSiembra;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idControles", nullable = false)
    private Controles controles;

    @ManyToOne
    @JoinColumn(name = "idUsuarios", nullable = false)
    private Usuarios usuario;


    public Lotes() {
    }

    public Lotes(int idLotes, String nombre, String tipoCultivo, String fechaSiembra, String estado, int cantidad, Controles controles, Usuarios usuario) {
        this.idLotes = idLotes;
        this.nombre = nombre;
        this.tipoCultivo = tipoCultivo;
        this.fechaSiembra = fechaSiembra;
        this.estado = estado;
        this.cantidad = cantidad;
        this.controles = controles;
        this.usuario = usuario;
    }

    public int getIdLotes() {
        return idLotes;
    }

    public void setIdLotes(int idLotes) {
        this.idLotes = idLotes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public String getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(String fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Controles getControles() {
        return controles;
    }

    public void setControles(Controles controles) {
        this.controles = controles;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
