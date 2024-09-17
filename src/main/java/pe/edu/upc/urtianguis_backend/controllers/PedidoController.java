package pe.edu.upc.urtianguis_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urtianguis_backend.dtos.CantPedidoPorDepartamentoDTO;
import pe.edu.upc.urtianguis_backend.dtos.CantPedidosPorMesDTO;
import pe.edu.upc.urtianguis_backend.dtos.PedidoDTO;
import pe.edu.upc.urtianguis_backend.entities.Pedido;
import pe.edu.upc.urtianguis_backend.serviceinterface.IPedidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedido")

public class PedidoController {
    @Autowired
    private IPedidoService pR;
    @GetMapping("/listarPedidos")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'VENDEDOR')")
    public List<PedidoDTO> listar(){
        return pR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PedidoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrarPedidos")
    @PreAuthorize("hasAuthority('CLIENTE')")
    public void insertar(@RequestBody PedidoDTO dto){
        ModelMapper m=new ModelMapper();
        Pedido ve=m.map(dto,Pedido.class);
        pR.insert(ve);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR', 'VENDEDOR')")
    public PedidoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        PedidoDTO dto=m.map(pR.listId(id),PedidoDTO.class);
        return dto;
    }
    @PutMapping("/modificarPedidos")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody PedidoDTO dto){
        ModelMapper m=new ModelMapper();
        Pedido ve=m.map(dto,Pedido.class);
        pR.update(ve);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void eliminar(@PathVariable("id") Integer id){
        pR.delete(id);
    }

    @GetMapping({"/TotalPedidoPorMes"})
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<CantPedidosPorMesDTO> pedidopormes() {
        List<String[]> lista = this.pR.totalpedidopormes();
        List<CantPedidosPorMesDTO> listaDTO = new ArrayList();
        for (String[] x : lista) {
            CantPedidosPorMesDTO dto = new CantPedidosPorMesDTO();
            dto.setAno(x[0]);
            dto.setMes(x[1]);
            dto.setCant(Integer.parseInt(x[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping({"/TotalPedidoPorDepartmento"})
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<CantPedidoPorDepartamentoDTO> pedidopordepartment() {
        List<String[]> lista = this.pR.totalpedidopordepartamento();
        List<CantPedidoPorDepartamentoDTO> listaDTO = new ArrayList();
        for (String[] x : lista) {
            CantPedidoPorDepartamentoDTO dto = new CantPedidoPorDepartamentoDTO();
            dto.setDepartament(x[0]);
            dto.setTotal(Integer.parseInt(x[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
