package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Departamento;

import java.util.List;


public interface IDepartamentoService {

    public List<Departamento> list();
    public void insert (Departamento d);
    public void update (Departamento d);
    public void delete (int idDepartamento);
    public Departamento listId(int idDepartamento);
    public List<String[]> obtenercantidad();
}
