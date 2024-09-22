package pe.edu.upc.urtianguis_backend.dtos;

import pe.edu.upc.urtianguis_backend.entities.Usuario;

public class RolDTO {
    private int Id_rol;
    private String Tipo_rol;
    private Usuario Us;

    public int getId_rol() {
        return Id_rol;
    }

    public void setId_rol(int id_rol) {
        Id_rol = id_rol;
    }

    public String getTipo_rol() {
        return Tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        Tipo_rol = tipo_rol;
    }

    public Usuario getUs() {
        return Us;
    }

    public void setUs(Usuario us) {
        Us = us;
    }
}
