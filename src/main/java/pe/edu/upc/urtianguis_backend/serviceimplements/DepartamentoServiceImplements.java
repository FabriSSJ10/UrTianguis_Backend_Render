package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Departamento;
import pe.edu.upc.urtianguis_backend.repositories.IDepartamentoRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.IDepartamentoService;

import java.util.List;

@Service
public class DepartamentoServiceImplements implements IDepartamentoService {

    @Autowired
    private IDepartamentoRepository dR;

    @Override
    public void insert(Departamento d) {dR.save(d);}


    @Override
    public List<Departamento> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDepartamento) {
        dR.deleteById(idDepartamento);
    }

    @Override
    public Departamento listId(int idDepartamento) {
        return dR.findById(idDepartamento).orElse(new Departamento());
    }

    @Override
    public void update(Departamento d) {
        dR.save(d);
    }

    @Override
    public List<String[]> obtenercantidad() {
        return dR.cantidad();
    }
}
