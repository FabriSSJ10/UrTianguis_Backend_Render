package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Tipo_Pago;
import pe.edu.upc.urtianguis_backend.repositories.ITipo_PagoRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.ITipo_PagoService;

import java.util.List;

@Service
public class Tipo_PagoServiceImplements implements ITipo_PagoService {
    @Autowired
    private ITipo_PagoRepository tpR;
    @Override
    public List<Tipo_Pago> list() {
        return tpR.findAll();
    }
    @Override
    public Tipo_Pago listId(int id) {
        return tpR.findById(id).orElse(new Tipo_Pago());
    }

    @Override
    public void insert(Tipo_Pago tp) {
        tpR.save(tp);
    }

    @Override
    public void update(Tipo_Pago tp) {
        tpR.save(tp);
    }

    @Override
    public void delete(int id) {
        tpR.deleteById(id);
    }
}
