package pe.edu.upc.urtianguis_backend.serviceinterface;

import pe.edu.upc.urtianguis_backend.entities.Comentario_Outfit;

import java.util.List;

public interface IComentario_OutfitService {
    public List<Comentario_Outfit>list();
    public void insert(Comentario_Outfit com);
    public void delete(int idComentario);
    public void update(Comentario_Outfit com);
    public Comentario_Outfit listId(int id);
}
