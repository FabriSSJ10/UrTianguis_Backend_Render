package pe.edu.upc.urtianguis_backend.dtos;

import pe.edu.upc.urtianguis_backend.entities.Prenda;
import pe.edu.upc.urtianguis_backend.entities.Tipo_Ocasion;

import java.time.LocalDate;

public class OutfitPublicaListarDTO {
    private int id_outfit;
    private String nombre;
    private String descripcion;
    private int calificacion;
    private String imagen;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String creadorPor;
    private String modificadoPor;
    private Tipo_Ocasion tipoOcasión;

    public int getId_outfit() {
        return id_outfit;
    }

    public void setId_outfit(int id_outfit) {
        this.id_outfit = id_outfit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getCreadorPor() {
        return creadorPor;
    }

    public void setCreadorPor(String creadorPor) {
        this.creadorPor = creadorPor;
    }

    public String getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    public Tipo_Ocasion getTipoOcasión() {
        return tipoOcasión;
    }

    public void setTipoOcasión(Tipo_Ocasion tipoOcasión) {
        this.tipoOcasión = tipoOcasión;
    }
}

