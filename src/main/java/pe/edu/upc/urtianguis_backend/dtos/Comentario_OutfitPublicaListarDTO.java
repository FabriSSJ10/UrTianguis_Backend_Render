package pe.edu.upc.urtianguis_backend.dtos;

public class Comentario_OutfitPublicaListarDTO {
    private int Id_comentario;
    private String comentario;

    public int getId_comentario() {
        return Id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        Id_comentario = id_comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
