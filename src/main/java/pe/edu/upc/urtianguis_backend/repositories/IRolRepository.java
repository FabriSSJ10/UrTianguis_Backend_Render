package pe.edu.upc.urtianguis_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.urtianguis_backend.entities.Rol;

public interface IRolRepository extends JpaRepository<Rol, Integer> {
}
