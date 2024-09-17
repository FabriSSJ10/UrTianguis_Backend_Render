package pe.edu.upc.urtianguis_backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.urtianguis_backend.entities.Tipo_Prenda;
@Repository

public interface ITipo_PrendaRepository extends JpaRepository<Tipo_Prenda, Integer>{

}
