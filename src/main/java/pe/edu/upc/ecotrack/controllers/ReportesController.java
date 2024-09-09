package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.QuejasDTO;
import pe.edu.upc.ecotrack.dtos.ReportesDTO;
import pe.edu.upc.ecotrack.entities.Reportes;
import pe.edu.upc.ecotrack.serviceinterfaces.IReportesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reportes")
public class ReportesController {
    @Autowired
    private IReportesService rS;
    @GetMapping
    public List<ReportesDTO> listar() {
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ReportesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ReportesDTO dto) {
        ModelMapper m=new ModelMapper();
        Reportes r=m.map(dto,Reportes.class);
        rS.insert(r);
    }
    @GetMapping("/{id}")
    public ReportesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ReportesDTO dto = m.map(rS.listId(id), ReportesDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody ReportesDTO dto) {
        ModelMapper m=new ModelMapper();
        Reportes r=m.map(dto,Reportes.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id) { rS.delete(id);}

}
