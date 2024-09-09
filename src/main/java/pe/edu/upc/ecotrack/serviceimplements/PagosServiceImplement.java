package pe.edu.upc.ecotrack.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ecotrack.entities.Pagos;
import pe.edu.upc.ecotrack.repositories.IPagosRepository;
import pe.edu.upc.ecotrack.serviceinterfaces.IPagosService;

import java.util.List;
@Service
public class PagosServiceImplement implements IPagosService {
    @Autowired
    private IPagosRepository pR;
    @Override
    public List<Pagos> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Pagos p) {
        pR.save(p);
    }

    @Override
    public Pagos listId(int id) {
        return pR.findById(id).orElse(new Pagos());
    }

    @Override
    public void update(Pagos p) {
        pR.save(p);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
}
