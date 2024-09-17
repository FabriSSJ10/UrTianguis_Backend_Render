package pe.edu.upc.urtianguis_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urtianguis_backend.entities.Pedido;

import java.util.List;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Integer> {
    @Query(value = " SELECT extract (year from i_fecha_creacion) as año, \n" +
            " extract (month from i_fecha_creacion) as mes,\n" +
            " count (*) as total_pedidos \n" +
            " from pedido group by extract (year from i_fecha_creacion), \n" +
            " extract (month from i_fecha_creacion) order by año, mes " ,nativeQuery = true)
    public List<String[]> totalpedidopormes();

    @Query (value = "select d.departamento, count (*) as total_pedidos from pedido as p join usuario \n" +
            " as u on p.id_usuario = u.id_usuario \n" +
            " join departamento as d on u.id_departamento = d.id_departamento group by departamento ",nativeQuery = true )
    public List<String[]>totalpedidopordepartamentos();

}
