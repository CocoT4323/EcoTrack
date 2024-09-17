package pe.edu.upc.ecotrack.dtos;

import jakarta.persistence.Column;

public class RolesDTO {
    private int idRoles;

    private String tipo;

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
