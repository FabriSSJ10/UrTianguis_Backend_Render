package pe.edu.upc.urtianguis_backend.dtos;
import pe.edu.upc.urtianguis_backend.entities.Departamento;
import pe.edu.upc.urtianguis_backend.entities.Rol;

import java.time.LocalDate;

public class UsuarioDTO {
    private int Id_Usuario;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Sexo;
    private String Dni;
    private String password;
    private LocalDate Fecha_Nacimiento;
    private String Telefono;
    private String username;
    private boolean Enabled;
    private LocalDate I_fecha_creacion;
    private LocalDate I_fecha_modificacion;
    private String I_creado_por;
    private String I_modificado_por;
    private Departamento Dp;
    private Rol Ro;

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        Id_Usuario = id_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }


    public LocalDate getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
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

    public String getI_creado_por() {
        return I_creado_por;
    }

    public void setI_creado_por(String i_creado_por) {
        I_creado_por = i_creado_por;
    }

    public String getI_modificado_por() {
        return I_modificado_por;
    }

    public void setI_modificado_por(String i_modificado_por) {
        I_modificado_por = i_modificado_por;
    }

    public Departamento getDp() {
        return Dp;
    }

    public void setDp(Departamento dp) {
        Dp = dp;
    }

    public Rol getRo() {
        return Ro;
    }

    public void setRo(Rol ro) {
        Ro = ro;
    }
}
