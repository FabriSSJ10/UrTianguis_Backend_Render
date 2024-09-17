package pe.edu.upc.urtianguis_backend.dtos;

public class CantPedidoPorDepartamentoDTO {
    private String departament;
    private int total;

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
