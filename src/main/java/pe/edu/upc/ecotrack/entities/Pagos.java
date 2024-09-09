package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagos;
    @Column(name = "monto",nullable = false)
    private double monto;
    @Column(name = "fechaPago",nullable = false)
    private LocalDate fechaPago;
    @Column(name="estado",nullable = false,length = 20)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "idCotizaciones", nullable = false)
    private Cotizaciones cotizaciones;

    public Pagos() {
    }

    public Pagos(int idPagos, double monto, LocalDate fechaPago, String estado, Cotizaciones cotizaciones) {
        this.idPagos = idPagos;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.estado = estado;
        this.cotizaciones = cotizaciones;
    }

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cotizaciones getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(Cotizaciones cotizaciones) {
        this.cotizaciones = cotizaciones;
    }
}
