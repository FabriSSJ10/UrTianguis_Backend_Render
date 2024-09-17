package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Pago;

import java.util.List;

public interface IPagoService {
    public List<Pago> list();
    public void insert(Pago p);
    public Pago listId(int id);
    public void update(Pago p);
    public void delete(int id);
    List<String[]> sumBySexService();
    List<String[]> sumByDepartmentService();
    List<String[]> pagosxtipodepago();
    List<String[]> pgsagrupadosxmesxmetodo();
}

