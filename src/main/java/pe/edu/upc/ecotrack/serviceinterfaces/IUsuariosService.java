package pe.edu.upc.ecotrack.serviceinterfaces;

import pe.edu.upc.ecotrack.entities.Usuarios;

import java.util.List;

public interface IUsuariosService {
    public List<Usuarios>list();
    public  void insert(Usuarios u);
    public Usuarios listId(int id);
    public void update(Usuarios u);
    public void  delete(int id);
}
