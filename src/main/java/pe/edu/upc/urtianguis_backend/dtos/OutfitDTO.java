package pe.edu.upc.urtianguis_backend.dtos;
import pe.edu.upc.urtianguis_backend.entities.Prenda;
import pe.edu.upc.urtianguis_backend.entities.Tipo_Ocasion;
import pe.edu.upc.urtianguis_backend.entities.Usuario;

import java.time.LocalDate;

public class OutfitDTO {
    private int Id_outfit;
    private String Nombre;
    private String Descripcion;
    private int Calificacion;
    private String Imagen;
    private LocalDate I_fecha_creacion;
    private LocalDate I_fecha_modificacion;
    private String I_creador_por;
    private String I_modificado_por;
    private Usuario Us;
    private Prenda Pr;
    private Tipo_Ocasion To;

    public int getId_outfit() {
        return Id_outfit;
    }

    public void setId_outfit(int id_outfit) {
        Id_outfit = id_outfit;
    }

    public Tipo_Ocasion getTo() {
        return To;
    }

    public void setTo(Tipo_Ocasion to) {
        To = to;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public LocalDate getI_fecha_creacion() {
        return I_fecha_creacion;
    }

    public void setI_fecha_creacion(LocalDate i_fecha_creacion) {
        I_fecha_creacion = i_fecha_creacion;
    }

    public LocalDate getI_fecha_modificacion() {
        return I_fecha_modificacion;
    }

    public void setI_fecha_modificacion(LocalDate i_fecha_modificacion) {
        I_fecha_modificacion = i_fecha_modificacion;
    }

    public String getI_creador_por() {
        return I_creador_por;
    }

    public void setI_creador_por(String i_creador_por) {
        I_creador_por = i_creador_por;
    }

    public String getI_modificado_por() {
        return I_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        I_modificado_por = i_modificado_por;
    }

    public Usuario getUs() {
        return Us;
    }

    public void setUs(Usuario us) {
        Us = us;
    }

    public Prenda getPr() {
        return Pr;
    }

    public void setPr(Prenda pr) {
        Pr = pr;
    }

    public Tipo_Ocasion getTipo_Ocasion() {
        return To;
    }

    public void setTipo_Ocasion(Tipo_Ocasion to) {
        this.To = to;
    }
}
