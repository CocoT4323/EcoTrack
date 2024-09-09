package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.CultivosDTO;
import pe.edu.upc.ecotrack.entities.Cultivos;
import pe.edu.upc.ecotrack.serviceinterfaces.ICultivosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cultivos")
public class CultivosController {
    @Autowired
    private ICultivosService cS;
    @GetMapping
    public List<CultivosDTO> listar(){
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CultivosDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody CultivosDTO dto) {
        ModelMapper m = new ModelMapper();
        Cultivos c = m.map(dto, Cultivos.class);
        cS.insert(c);
    }
    @GetMapping("/{id}")
    public CultivosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        CultivosDTO dto = m.map(cS.listId(id), CultivosDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody CultivosDTO dto) {
        ModelMapper m = new ModelMapper();
        Cultivos c = m.map(dto, Cultivos.class);
        cS.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
}
