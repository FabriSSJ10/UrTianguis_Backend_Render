package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Tipo_Ocasion;

import java.util.List;

public interface ITipo_OcasionService {
    public List<Tipo_Ocasion> list();
    public void insert (Tipo_Ocasion to);
    public void update (Tipo_Ocasion to);
    public void delete (int id);
    public Tipo_Ocasion listId(int idTipo_Ocasion);
}
