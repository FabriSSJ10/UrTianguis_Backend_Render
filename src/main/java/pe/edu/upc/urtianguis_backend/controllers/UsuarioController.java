package pe.edu.upc.urtianguis_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urtianguis_backend.dtos.UsuarioDTO;
import pe.edu.upc.urtianguis_backend.dtos.UsuarioListarVendedorDTO;
import pe.edu.upc.urtianguis_backend.entities.Usuario;
import pe.edu.upc.urtianguis_backend.serviceinterface.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @GetMapping("/listarParaAdmin")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<UsuarioDTO>listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/listarParaVendedor")
    @PreAuthorize("hasAuthority('VENDEDOR')")
    public List<UsuarioListarVendedorDTO>listarUsuariosVendedores(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, UsuarioListarVendedorDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrarUsuarios")
    public void insertar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario us=m.map(dto,Usuario.class);
        uS.insert(us);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(uS.listId(id),UsuarioDTO.class);
        return dto;
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @PutMapping("/modificarUsuarios")
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario us=m.map(dto,Usuario.class);
        uS.update(us);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void eliminar(@PathVariable("id")Integer id){uS.delete(id);}

    @GetMapping("/Mes_menos_usuarios")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public String MesMenosUsuarios(){
        return uS.mesMenosUsuarios();
    }


}
