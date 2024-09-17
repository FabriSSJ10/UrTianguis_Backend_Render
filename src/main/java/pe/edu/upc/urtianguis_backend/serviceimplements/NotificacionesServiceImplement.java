package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Notificaciones;
import pe.edu.upc.urtianguis_backend.repositories.INotificacionesRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.INotificacionesService;

import java.util.List;

@Service
public class NotificacionesServiceImplement implements INotificacionesService {
    @Autowired
    private INotificacionesRepository nR;
    @Override
    public List<Notificaciones> list() {
        return nR.findAll();
    }
    @Override
    public Notificaciones listId(int id) {
        return nR.findById(id).orElse(new Notificaciones());
    }

    @Override
    public void insert(Notificaciones n) {
        nR.save(n);
    }

    @Override
    public void update(Notificaciones n) {
        nR.save(n);
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }
}
