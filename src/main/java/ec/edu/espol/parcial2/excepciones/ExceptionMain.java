package ec.edu.espol.parcial2.excepciones;

import ec.edu.espol.animales.*;
import ec.edu.espol.enums.DogSize;

public class ExceptionMain {

    public static void main() {
        Animal a = new Perro(DogSize.GRANDE);
        try {;
            if (a instanceof Perro) {
                Perro p = (Perro) a;
                System.out.println(p.getNombre());
            }
        }
        catch(ClassCastException ex) {
            System.out.println("NO SE PUEDE CONVERTIR UN GATO EN PERRO");
        }
        finally {
            System.out.println("TERMINO EL PROGRAMA");
        }
    }
}
