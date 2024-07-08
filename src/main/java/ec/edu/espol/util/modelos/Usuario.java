package ec.edu.espol.util.modelos;

import ec.edu.espol.util.common.Rol;

public abstract class Usuario {
    private String nombre;
    private String cedula;
    protected String usuario;
    private String clave;
    private Rol rol;

    public Usuario() {}

    public Usuario(String nombre, String cedula, String usuario, String clave, Rol rol) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public Usuario(String nombre, String usuario, String clave) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public abstract void verificarUsuario();

}
