package pe.edu.upc.urtianguis_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urtianguis_backend.dtos.RolDTO;
import pe.edu.upc.urtianguis_backend.entities.Rol;
import pe.edu.upc.urtianguis_backend.serviceinterface.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAuthority('ADMINISTRADOR')")
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private IRolService rS;
    @PostMapping("/registrarRoles")
    public  void registrar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }
    @GetMapping("/listarRoles")
    public List<RolDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ rS.delete(id); }

    @GetMapping("/{id}")
    public  RolDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RolDTO dto = m.map(rS.listId(id), RolDTO.class);
        return dto;
    }
    @PutMapping("/modificarRoles")
    public  void modificar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.update(r);
    }
}
