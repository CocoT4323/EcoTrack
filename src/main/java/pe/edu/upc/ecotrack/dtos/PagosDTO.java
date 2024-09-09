package pe.edu.upc.ecotrack.dtos;

import pe.edu.upc.ecotrack.entities.Cotizaciones;

import java.time.LocalDate;

public class PagosDTO {
    private int idPagos;
    private int monto;
    private LocalDate fechaPago;
    private String estado;
    private Cotizaciones cotizacion;

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
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

    public Cotizaciones getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizaciones cotizacion) {
        this.cotizacion = cotizacion;
    }
}
