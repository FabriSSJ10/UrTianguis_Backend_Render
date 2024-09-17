package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Pedido;
import pe.edu.upc.urtianguis_backend.repositories.IPedidoRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.IPedidoService;

import java.util.List;

@Service
public class PedidoServiceImplements implements IPedidoService {
    @Autowired
    private IPedidoRepository pR;
    @Override
    public List<Pedido> list() {
        return pR.findAll();
    }
    @Override
    public void insert(Pedido p) {
        pR.save(p);
    }
    @Override
    public Pedido listId(int id) {
        return pR.findById(id).orElse(new Pedido());
    }
    @Override
    public void update(Pedido p) {
        pR.save(p);
    }
    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }
    @Override
    public List<String[]> totalpedidopormes() {
        return pR.totalpedidopormes();
    }
    @Override
    public List<String[]> totalpedidopordepartamento() {
        return pR.totalpedidopordepartamentos();
    }

}
