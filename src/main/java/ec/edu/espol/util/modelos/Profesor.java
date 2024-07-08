package ec.edu.espol.util.modelos;

import ec.edu.espol.util.common.Rol;

public class Profesor extends Usuario {
    private String titulo;
    
    public Profesor(String nombre, String cedula, String usuario, String clave, Rol rol, String titulo) {
        super(nombre, cedula, usuario, clave, rol);
        this.titulo = titulo;
    }

    public Profesor(String usuario, String clave) {
        super();
        this.usuario = usuario;
        this.setClave(clave);
    }

    public Profesor(String cedula, String usuario, String clave) {
        super(cedula, usuario, clave);
    }

    public void setMoreInfo(String nombre, Rol rol, String titulo) {
        this.setNombre(nombre);
        this.setRol(rol);
        this.titulo = titulo;
    }

    public void setMoreInfo(String nombre, String titulo) {}

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void verificarUsuario() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        else if (this == o) return true;
        else if (o.getClass() != o.getClass()) return false;
        Profesor PObject = (Profesor) o;
        return PObject.getUsuario().equals(this.getUsuario());
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre();
    }
}
