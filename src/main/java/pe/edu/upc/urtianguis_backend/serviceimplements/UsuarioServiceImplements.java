package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Usuario;
import pe.edu.upc.urtianguis_backend.repositories.IUsuarioRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplements implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public List<Usuario> list() {return uR.findAll();}

    @Override
    public List<Usuario> listarUsuariosVendedores() {return uR.findAll();}

    @Override
    public void insert(Usuario u) {
        uR.save(u);
    }

    @Override
    public void update(Usuario u) {
        uR.save(u);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public Usuario listId(int id) {
        return uR.findById(id).orElse(new Usuario());
    }

    @Override
    public String mesMenosUsuarios() {
        List<Object[]> mesMenor = uR.mesMenosUsuarios();
        if (!mesMenor.isEmpty()) {
            Object[] UsuarioxMes = mesMenor.get(0);
            String mes = (String) UsuarioxMes[0];
            long totalUsuarios= (long) UsuarioxMes[1];
            return ("Mes con menos usuarios: "+mes+" con "+ totalUsuarios+" usuarios");
        } else{
            return ("no hay datos");
        }
    }
}
