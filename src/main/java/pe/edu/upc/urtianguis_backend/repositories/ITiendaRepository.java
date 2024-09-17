package pe.edu.upc.urtianguis_backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urtianguis_backend.entities.Tienda;

@Repository
public interface ITiendaRepository extends JpaRepository<Tienda, Integer> {
}

