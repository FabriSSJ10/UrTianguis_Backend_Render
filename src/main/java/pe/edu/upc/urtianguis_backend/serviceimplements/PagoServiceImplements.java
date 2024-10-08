package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Pago;
import pe.edu.upc.urtianguis_backend.repositories.IPagoRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.IPagoService;

import java.util.List;

@Service
public class PagoServiceImplements implements IPagoService {
    @Autowired
    private IPagoRepository pR;

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Pago p) {
        pR.save(p);
    }

    @Override
    public Pago listId(int id) {
        return pR.findById(id).orElse(new Pago());
    }

    @Override
    public void update(Pago p) {
        pR.save(p);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public List<String[]> sumBySexService() {
        return pR.sumBySex();
    }

    @Override
    public List<String[]> sumByDepartmentService() {
        return pR.sumByDepartment();
    }

    @Override
    public List<String[]> pagosxtipodepago(){return pR.cantpagosxtipodepago();}

    @Override
    public List<String[]>pgsagrupadosxmesxmetodo(){return pR.pagos_agrupadosxmesxmetodo();}

}
