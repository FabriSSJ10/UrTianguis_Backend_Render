package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Pedido;

import java.util.List;

public interface IPedidoService {
    public List<Pedido> list();
    public void insert(Pedido p);
    public Pedido listId(int id);
    public void update(Pedido p);
    public void delete(int id);
    List<String[]> totalpedidopormes();
    List<String[]> totalpedidopordepartamento();
}
