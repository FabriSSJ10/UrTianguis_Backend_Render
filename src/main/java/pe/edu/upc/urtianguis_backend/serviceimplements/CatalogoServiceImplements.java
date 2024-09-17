package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Catalogo;
import pe.edu.upc.urtianguis_backend.repositories.ICatalogoRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.ICatalogoService;

import java.util.List;

@Service
public class CatalogoServiceImplements implements ICatalogoService {
    @Autowired
    private ICatalogoRepository cP;
    @Override
    public List<Catalogo> list() {
        return cP.findAll();
    }
    @Override
    public void insert(Catalogo p) {
        cP.save(p);
    }
    @Override
    public Catalogo listId(int id) {
        return cP.findById(id).orElse(new Catalogo());
    }
    @Override
    public void update(Catalogo p) {
        cP.save(p);
    }
    @Override
    public void delete(int id) {
        cP.deleteById(id);
    }
}
