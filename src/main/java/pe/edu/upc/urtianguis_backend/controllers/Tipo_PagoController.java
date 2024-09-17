package pe.edu.upc.urtianguis_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urtianguis_backend.dtos.Tipo_PagoDTO;
import pe.edu.upc.urtianguis_backend.entities.Tipo_Pago;
import pe.edu.upc.urtianguis_backend.serviceinterface.ITipo_PagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAuthority('ADMINISTRADOR')")
@RequestMapping("/tipo_pago")

public class Tipo_PagoController {
    @Autowired
    private ITipo_PagoService tpR;
    @GetMapping("/listarTipo_pago")
    public List<Tipo_PagoDTO>listar(){
        return tpR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Tipo_PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrarTipo_pago")
    public void insertar(@RequestBody Tipo_PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_Pago ve=m.map(dto,Tipo_Pago.class);
        tpR.insert(ve);
    }

    @GetMapping("/{id}")
    public Tipo_PagoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Tipo_PagoDTO dto=m.map(tpR.listId(id),Tipo_PagoDTO.class);
        return dto;
    }
    @PutMapping("/modificarTipo_pago")
    public void modificar(@RequestBody Tipo_PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_Pago ve=m.map(dto,Tipo_Pago.class);
        tpR.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tpR.delete(id);
    }
}
