package pe.edu.upc.urtianguis_backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urtianguis_backend.entities.Tipo_Pago;

@Repository
public interface ITipo_PagoRepository extends JpaRepository<Tipo_Pago, Integer> {
}
