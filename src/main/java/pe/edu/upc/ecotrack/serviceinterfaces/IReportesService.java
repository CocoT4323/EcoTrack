package pe.edu.upc.ecotrack.serviceinterfaces;

import pe.edu.upc.ecotrack.entities.Reportes;

import java.util.List;

public interface IReportesService {
    public List<Reportes> list();
    public void insert(Reportes re);
    public Reportes listId(int id);
    public void update(Reportes r);
    public void delete(int id);
}
