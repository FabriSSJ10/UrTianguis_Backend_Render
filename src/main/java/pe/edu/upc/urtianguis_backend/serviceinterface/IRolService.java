package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Rol;

import java.util.List;

public interface IRolService {
    public void insert(Rol r);
    public List<Rol> list();
    public void delete(int idRol);
    public Rol listId(int idRol);
    public void update(Rol r);
}
