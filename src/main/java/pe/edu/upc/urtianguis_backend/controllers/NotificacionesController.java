package pe.edu.upc.urtianguis_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urtianguis_backend.dtos.NotificacionesDTO;
import pe.edu.upc.urtianguis_backend.entities.Notificaciones;
import pe.edu.upc.urtianguis_backend.serviceinterface.INotificacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAnyAuthority('ADMINISTRADOR','VENDEDOR')")
@RequestMapping("/notificacion")
public class NotificacionesController {
    @Autowired
    private INotificacionesService nR;
    @GetMapping("/listarNotificaciones")
    public List<NotificacionesDTO>listar(){
        return nR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,NotificacionesDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrarNotificaciones")
    public void insertar(@RequestBody NotificacionesDTO dto){
        ModelMapper m=new ModelMapper();
        Notificaciones us=m.map(dto,Notificaciones.class);
        nR.insert(us);
    }

    @GetMapping("/{id}")
    public NotificacionesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        NotificacionesDTO dto=m.map(nR.listId(id),NotificacionesDTO.class);
        return dto;
    }

    @PutMapping("/modificarNotificaciones")
    public void modificar(@RequestBody NotificacionesDTO dto){
        ModelMapper m=new ModelMapper();
        Notificaciones us=m.map(dto,Notificaciones.class);
        nR.update(us);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){nR.delete(id);}

}