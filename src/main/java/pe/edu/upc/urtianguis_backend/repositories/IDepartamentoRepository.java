package pe.edu.upc.urtianguis_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urtianguis_backend.entities.Departamento;

import java.util.List;

@Repository
public interface IDepartamentoRepository extends JpaRepository<Departamento, Integer> {
    @Query(value = " SELECT departamento AS Departamento,\n" +
            "       COUNT(usuario.id_usuario) AS Cantidad_Usuarios \n" +
            " FROM usuario \n" +
            " JOIN departamento ON usuario.id_departamento = departamento.id_departamento \n" +
            " GROUP BY departamento ",nativeQuery = true)
    public List<String[]> cantidad();
}
