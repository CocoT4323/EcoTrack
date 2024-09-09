package pe.edu.upc.ecotrack.serviceinterfaces;

import pe.edu.upc.ecotrack.entities.Vehiculos;

import java.util.List;

public interface IVehiculosService {
    public List<Vehiculos> list();
    public void insert(Vehiculos ve);
    public Vehiculos listId(int id);
    public void update(Vehiculos ve);
    public void delete(int id);
}
