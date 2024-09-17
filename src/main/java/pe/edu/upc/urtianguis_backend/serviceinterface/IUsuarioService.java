package pe.edu.upc.urtianguis_backend.serviceinterface;
import pe.edu.upc.urtianguis_backend.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public List<Usuario> listarUsuariosVendedores();
    public void insert(Usuario u);
    public void update(Usuario u);
    public void delete(int id);
    public Usuario listId(int id);
    public String mesMenosUsuarios();
}
