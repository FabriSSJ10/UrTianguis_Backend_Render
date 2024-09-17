package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Prenda;

import java.util.List;

public interface IPrendaService {
    public List<Prenda> list();
    public void insert(Prenda p);
    public Prenda listId(int id);
    public void update(Prenda p);
    public void delete(int id);
    public List<String[]> prendasxtienda();
}
