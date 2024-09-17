package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Det_Pedido;
import pe.edu.upc.urtianguis_backend.repositories.IDet_PedidoRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.IDet_PedidoService;

import java.util.List;

@Service
public class Det_PedidoServiceImplements implements IDet_PedidoService {
    @Autowired
    private IDet_PedidoRepository dP;
    @Override
    public List<Det_Pedido> list() {
        return dP.findAll();
    }
    @Override
    public void insert(Det_Pedido p) {
        dP.save(p);
    }
    @Override
    public Det_Pedido listId(int id) {
        return dP.findById(id).orElse(new Det_Pedido());
    }
    @Override
    public void update(Det_Pedido p) {
        dP.save(p);
    }
    @Override
    public void delete(int id) {
        dP.deleteById(id);
    }
    public List<String[]> TotalxPrenda() {
        return this.dP.TotalxPrenda();
    }
}
