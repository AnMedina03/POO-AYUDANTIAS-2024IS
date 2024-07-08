package ec.edu.espol.parcial1.practica;

import ec.edu.espol.util.common.Rol;
import ec.edu.espol.util.modelos.Profesor;

public class RegistroMateria {
    
    public static void main(String[] args) {
        Profesor p = new Profesor("0516151561", "profe", "abc123");
        p.setMoreInfo("Pepe", Rol.PROFESOR, "Ingenieron");
        p.verificarUsuario();
    }
}
