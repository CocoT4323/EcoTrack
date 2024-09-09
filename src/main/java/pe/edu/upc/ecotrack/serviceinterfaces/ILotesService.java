package pe.edu.upc.ecotrack.serviceinterfaces;

import pe.edu.upc.ecotrack.entities.Lotes;

import java.util.List;

public interface ILotesService {
    public List<Lotes> list();
    public void insert(Lotes lote);
    public Lotes listId(int id);
    public void update(Lotes lote);
    public void delete(int id);
}
