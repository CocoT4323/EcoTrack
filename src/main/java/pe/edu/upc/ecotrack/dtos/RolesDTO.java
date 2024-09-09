package pe.edu.upc.ecotrack.dtos;

public class RolesDTO {
    private int idRoles;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return idRoles;
    }

    public void setId(int idRoles) {
        this.idRoles = idRoles;
    }
}
