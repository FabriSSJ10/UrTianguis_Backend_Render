package pe.edu.upc.urtianguis_backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "notificacion")
public class Notificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Notificacion;
    @Column(name = "Confirmacion_Pedido", nullable = false)
    private boolean Confirmacion_Pedido;
    @Column(name = "Confirmacion_Entrega", nullable = false)
    private boolean Confirmacion_Entrega;

    public Notificaciones() {

    }

    public Notificaciones(int id_Notificacion, boolean confirmacion_Pedido, boolean confirmacion_Entrega) {
        Id_Notificacion = id_Notificacion;
        Confirmacion_Pedido = confirmacion_Pedido;
        Confirmacion_Entrega = confirmacion_Entrega;
    }

    public int getId_Notificacion() {
        return Id_Notificacion;
    }

    public void setId_Notificacion(int id_Notificacion) {
        Id_Notificacion = id_Notificacion;
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
