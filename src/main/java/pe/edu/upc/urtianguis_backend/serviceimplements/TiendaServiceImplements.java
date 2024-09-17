package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Tienda;
import pe.edu.upc.urtianguis_backend.repositories.ITiendaRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.ITiendaService;

import java.util.List;

@Service
public class TiendaServiceImplements implements ITiendaService {
    @Autowired
    private ITiendaRepository tR;
    @Override
    public List<Tienda> list() {return tR.findAll();}

    @Override
    public void insert(Tienda t) {
        tR.save(t) ;
    }

    @Override
    public Tienda listId(int id) {
        return tR.findById(id).orElse(new Tienda());
    }

    @Override
    public void update(Tienda t) {
        tR.save(t);
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

}
