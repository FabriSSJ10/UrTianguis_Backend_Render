package pe.edu.upc.urtianguis_backend.serviceinterface;
import pe.edu.upc.urtianguis_backend.entities.Tipo_Prenda;
import java.util.List;
public interface ITipo_PrendaService {

    public List<Tipo_Prenda> list();

    public void insert(Tipo_Prenda tipo);
    public void update (Tipo_Prenda tipo);
    public void delete(int id);
    public Tipo_Prenda listId(int id);
}
