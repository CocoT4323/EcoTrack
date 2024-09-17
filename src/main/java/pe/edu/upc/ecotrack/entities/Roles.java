package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoles;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    public Roles() {
    }

    public Roles(int idRoles, String tipo) {
        this.idRoles = idRoles;
        this.tipo = tipo;
    }

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
