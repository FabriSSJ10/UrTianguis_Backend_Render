package pe.edu.upc.urtianguis_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urtianguis_backend.entities.Tipo_Ocasion;

@Repository
public interface ITipo_OcasionRepository extends JpaRepository<Tipo_Ocasion, Integer> {
}
