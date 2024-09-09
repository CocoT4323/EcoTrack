package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.VehiculosDTO;
import pe.edu.upc.ecotrack.entities.Vehiculos;
import pe.edu.upc.ecotrack.repositories.IVehiculosRepository;
import pe.edu.upc.ecotrack.serviceinterfaces.IVehiculosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vehiculos")
public class VehiculosController {
    @Autowired
    private IVehiculosService vS;
    @GetMapping
    public List<VehiculosDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VehiculosDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody VehiculosDTO dto){
        ModelMapper m=new ModelMapper();
        Vehiculos v=m.map(dto, Vehiculos.class);
        vS.insert(v);
    }
    @GetMapping("/{id}")
    public VehiculosDTO listarId(@PathVariable ("id") Integer id){
        ModelMapper m=new ModelMapper();
        VehiculosDTO dto=m.map(vS.listId(id),VehiculosDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody VehiculosDTO dto) {
        ModelMapper m = new ModelMapper();
        Vehiculos ve = m.map(dto, Vehiculos.class);
        vS.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){vS.delete(id);}
}
