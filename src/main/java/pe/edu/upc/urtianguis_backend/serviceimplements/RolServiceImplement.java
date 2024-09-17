package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Rol;
import pe.edu.upc.urtianguis_backend.repositories.IRolRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rR;

    @Override
    public void insert(Rol r) {
        rR.save(r);
    }

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Rol listId(int idRol) {
        return rR.findById(idRol).orElse(new Rol());
    }

    @Override
    public void update(Rol r) {
        rR.save(r);
    }
}
