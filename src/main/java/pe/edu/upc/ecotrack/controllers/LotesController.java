package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.LotesDTO;
import pe.edu.upc.ecotrack.entities.Lotes;
import pe.edu.upc.ecotrack.serviceinterfaces.ILotesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/lotes")
public class LotesController {
    @Autowired
    private ILotesService lS;
    @GetMapping
    public List<LotesDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LotesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody LotesDTO dto) {
        ModelMapper m = new ModelMapper();
        Lotes l = m.map(dto, Lotes.class);
        lS.insert(l);
    }

    @GetMapping("/{id}")
    public LotesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        LotesDTO dto = m.map(lS.listId(id), LotesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody LotesDTO dto) {
        ModelMapper m = new ModelMapper();
        Lotes l = m.map(dto, Lotes.class);
        lS.update(l);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        lS.delete(id);
    }
}
