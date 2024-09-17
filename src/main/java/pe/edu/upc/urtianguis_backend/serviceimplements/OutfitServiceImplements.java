package pe.edu.upc.urtianguis_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urtianguis_backend.entities.Outfit;
import pe.edu.upc.urtianguis_backend.repositories.IOutfitRepository;
import pe.edu.upc.urtianguis_backend.serviceinterface.IOutfitService;

import java.util.List;

@Service
public class OutfitServiceImplements implements IOutfitService{

    @Autowired
    private IOutfitRepository oR;

    @Override
    public List<Outfit> list() {return oR.findAll();}

    @Override
    public void insert(Outfit o) {
        oR.save(o);
    }

    @Override
    public Outfit listId(int id) {
        return oR.findById(id).orElse(new Outfit());
    }

    @Override
    public void update(Outfit o) {
        oR.save(o);
    }

    @Override
    public void delete(int id) {
        oR.deleteById(id);
    }

    @Override
    public List<String[]> obtenerCantidad() {
        return oR.cantidad();
    }
}
