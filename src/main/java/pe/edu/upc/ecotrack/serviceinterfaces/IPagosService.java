package pe.edu.upc.ecotrack.serviceinterfaces;

import pe.edu.upc.ecotrack.entities.Pagos;

import java.util.List;

public interface IPagosService {
    public List<Pagos> list();
    public void insert(Pagos p);
    public Pagos listId(int id);
    public void update(Pagos p);
    public void delete(int id);
}
