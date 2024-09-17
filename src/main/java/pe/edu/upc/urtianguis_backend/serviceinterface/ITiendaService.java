package pe.edu.upc.urtianguis_backend.serviceinterface;
import pe.edu.upc.urtianguis_backend.entities.Tienda;

import java.util.List;

public interface ITiendaService {
    public List<Tienda> list();
    void insert(Tienda t);
    public Tienda listId(int id);
    void update(Tienda t);
    void delete(int id);
}
