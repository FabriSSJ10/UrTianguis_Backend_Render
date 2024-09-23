package pe.edu.upc.urtianguis_backend.dtos;

import jakarta.persistence.Column;

public class Tipo_OcasionDTO {

    private int id_tipo_ocasion;
    private String Tipo_ocasion;

    public int getId_tipo_ocasion() {
        return id_tipo_ocasion;
    }

    public void setId_tipo_ocasion(int id_tipo_ocasion) {
        this.id_tipo_ocasion = id_tipo_ocasion;
    }

    public String getTipo_ocasion() {
        return Tipo_ocasion;
    }

    public void setTipo_ocasion(String tipo_ocasion) {
        Tipo_ocasion = tipo_ocasion;
    }
}
