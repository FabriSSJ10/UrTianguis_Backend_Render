package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Outfit;

import java.util.List;

public interface IOutfitService {
    public List<Outfit> list();
    public void insert (Outfit o);
    public Outfit listId(int id);
    public void update (Outfit o);
    public void delete (int o);
    public List<String[]>obtenerCantidad();
}
