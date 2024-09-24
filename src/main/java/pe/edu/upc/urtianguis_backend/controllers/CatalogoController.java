package pe.edu.upc.urtianguis_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urtianguis_backend.dtos.CatalogoDTO;
import pe.edu.upc.urtianguis_backend.dtos.CatalogoPublicaListarDTO;
import pe.edu.upc.urtianguis_backend.entities.Catalogo;
import pe.edu.upc.urtianguis_backend.serviceinterface.ICatalogoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAuthority('CLIENTE')")
@RequestMapping("/catalogo")
public class CatalogoController {
    @Autowired
    private ICatalogoService cP;
    @GetMapping("/listarCatalogosAdmin")
    public List<CatalogoDTO> listar(){
        return cP.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CatalogoDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/listarCatalogos")
    public List<CatalogoPublicaListarDTO> listarPublico(){
        return cP.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CatalogoPublicaListarDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrarCatalogos")
    public void insertar(@RequestBody CatalogoDTO dto){
        ModelMapper m=new ModelMapper();
        Catalogo ve=m.map(dto, Catalogo.class);
        cP.insert(ve);
    }
    @GetMapping("/{id}")
    public CatalogoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CatalogoDTO dto=m.map(cP.listId(id),CatalogoDTO.class);
        return dto;
    }
    @PutMapping("/modificarCatalogos")
    public void modificar(@RequestBody CatalogoDTO dto){
        ModelMapper m=new ModelMapper();
        Catalogo ve=m.map(dto,Catalogo.class);
        cP.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cP.delete(id);
    }
}
