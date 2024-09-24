package pe.edu.upc.urtianguis_backend.dtos;

public class NotificacionesDTO {
    private int Id_Notificacion;
    private boolean Confirmacion_Pedido;
    private boolean Confirmacion_Entrega;

    public int getId_Notificacion() {
        return Id_Notificacion;
    }

    public void setId_Notificacion(int id_Notificaciones) {
        Id_Notificacion = id_Notificaciones;
    }

    public boolean isConfirmacion_Pedido() {
        return Confirmacion_Pedido;
    }

    public void setConfirmacion_Pedido(boolean confirmacion_Pedido) {
        Confirmacion_Pedido = confirmacion_Pedido;
    }

    public boolean isConfirmacion_Entrega() {
        return Confirmacion_Entrega;
    }

    public void setConfirmacion_Entrega(boolean confirmacion_Entrega) {
        Confirmacion_Entrega = confirmacion_Entrega;
    }
}
