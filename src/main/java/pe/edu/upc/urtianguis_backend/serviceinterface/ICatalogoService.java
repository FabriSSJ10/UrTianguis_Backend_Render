package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Catalogo;

import java.util.List;

public interface ICatalogoService {
    public List<Catalogo> list();
    public void insert (Catalogo c);
    public Catalogo listId(int id);
    public void update (Catalogo c);
    public void delete (int id);
}
