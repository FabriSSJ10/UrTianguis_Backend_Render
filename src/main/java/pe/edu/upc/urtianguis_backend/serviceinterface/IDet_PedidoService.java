package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Det_Pedido;

import java.util.List;

public interface IDet_PedidoService {
    public List<Det_Pedido> list();
    public void insert(Det_Pedido p);
    public Det_Pedido listId(int id);
    public void update(Det_Pedido p);
    public void delete(int id);
    List<String[]> TotalxPrenda();
}
