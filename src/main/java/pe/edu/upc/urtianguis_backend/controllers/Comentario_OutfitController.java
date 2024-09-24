package pe.edu.upc.urtianguis_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urtianguis_backend.dtos.Comentario_OutfitDTO;
import pe.edu.upc.urtianguis_backend.dtos.Comentario_OutfitPublicaListarDTO;
import pe.edu.upc.urtianguis_backend.entities.Comentario_Outfit;
import pe.edu.upc.urtianguis_backend.serviceinterface.IComentario_OutfitService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAuthority('CLIENTE')")
@RequestMapping("/comentario_outfit")
public class Comentario_OutfitController {
    @Autowired
    private IComentario_OutfitService cS;
    @GetMapping("/listarComentarios_outfitAdmin")
    public List<Comentario_OutfitDTO>listar(){
        return cS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,Comentario_OutfitDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/listarComentarios_outfit")
    public List<Comentario_OutfitPublicaListarDTO>listarPublico(){
        return cS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,Comentario_OutfitPublicaListarDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrarComentarios_outfit")
    public void insertar(@RequestBody Comentario_OutfitDTO dto){
        ModelMapper m= new ModelMapper();
        Comentario_Outfit com=m.map(dto,Comentario_Outfit.class);
        cS.insert(com);
    }

    @GetMapping("/{id}")
    public Comentario_OutfitDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        Comentario_OutfitDTO dto = m.map(cS.listId(id), Comentario_OutfitDTO.class);
        return dto;
    }

    @PutMapping("/modificarComentarios_outfit")
    public void modificar(@RequestBody Comentario_OutfitDTO dto){
        ModelMapper m= new ModelMapper();
        Comentario_Outfit com = m.map(dto,Comentario_Outfit.class);
        cS.update(com);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("Id") Integer id){
        cS.delete(id);
    }
}
