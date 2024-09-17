package pe.edu.upc.urtianguis_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urtianguis_backend.entities.Comentario_Outfit;

@Repository
public interface IComentario_OutfitRepository extends JpaRepository<Comentario_Outfit, Integer> {
}
