package ec.edu.espol.parcial1.semana6;

import ec.edu.espol.parcial1.semana4.common.animales.*;
import ec.edu.espol.parcial1.semana4.enums.DogSize;

public class SextaSemana {
    public static void main(String[] args) {
        // Animal a1 = new Animal();
        // Animal b1 = new Animal();
        // System.out.println(a1.jugar(b1));

        //Upcasting
        // Cómo manejo un objeto, como padre un elemento hijo
        Animal a2 = new Perro(DogSize.MEDIANO);
        Animal a3 = new Gato(true);

        //Downcasting
        Perro p = (Perro) a2;
        Gato g = (Gato) a3;

        //Polimorfismo
        // Luego de UPCASTING. Verificar si objeto de tipo Clase Padre es un objeto de tipo Clase Hijo Específico.
        if (a2 instanceof Perro) {System.out.println(p.jugar(a2)); }

        // Luego de DOWNCASTING. No se validan instanceof de un objeto de tipo Clase Hijo Específico porque es redundante.
        System.out.println(p.jugar(p));
    }
}
