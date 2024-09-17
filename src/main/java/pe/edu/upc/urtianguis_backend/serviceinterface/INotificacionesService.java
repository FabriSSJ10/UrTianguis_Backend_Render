package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Notificaciones;

import java.util.List;

public interface INotificacionesService {
    public List<Notificaciones> list();
    public Notificaciones listId(int id);
    void insert(Notificaciones n);
    void update(Notificaciones n);
    void delete(int id);
}
