package ec.edu.espol.parcial1.semana4;

import java.util.ArrayList;

import ec.edu.espol.parcial1.semana4.common.animales.*;
import ec.edu.espol.parcial1.semana4.enums.DogSize;

public class CuartaSemana {
    public static void main() {
        // Perro p = new Perro();
        // Gato g = new Gato();
        // Perro p1 = p;
        // Perro p2 = new Perro("Firulais", 5, "Corgi");
        // System.out.println(p.equals(null));
        // System.out.println(p.equals(p1));
        // System.out.println(p.equals(g));
        // System.out.println(p.equals(p2));
        Animal a = new Perro("Firulais", 5, "Corgi");

        Animal p = new Perro("Goldo", 5, "Corgi", DogSize.valueOf("MEDIANO"));
        Animal g = new Gato("Firulais", 5, "Corgi", true);

        Perro p1 = new Perro("Pancho", 5, "Corgi", DogSize.valueOf("PEQUENIO"));
        Perro p2 = new Perro("Silver", 5, "Golden", DogSize.valueOf("GRANDE"));
        Gato g1 = new Gato("Firulais", 5, "Corgi", true);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(p);
        animals.add(g);
        animals.add(g1);

        
        ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
        
        if (p instanceof Perro) movimientos.add((Perro) p);
        if (g instanceof Gato) movimientos.add((Gato) g);

        ArrayList<Comportamiento> comportamientos = new ArrayList<Comportamiento>();
        comportamientos.add(a);
        comportamientos.add(p1);
        comportamientos.add(g1);

        for (Movimiento m : movimientos) {
            m.caminar();
            if (m instanceof Perro) {
                System.out.println(((Perro) m).jugar(a));
            }
            else if (m instanceof Gato) {
                ((Gato) m).cazar();
            }
        }

        for (Comportamiento m : comportamientos) {
            m.observar();
        }

        ArrayList<Perro> perros = new ArrayList<Perro>();
        perros.add((Perro)p1); // Pequeño
        perros.add((Perro)a); // Mediano
        perros.add((Perro)p2); // Grande

        
        Perro pChild = (Perro) p;


        // Comparable<E> =====> Comparable<Perro>
        for (Perro perrito : perros) {
            System.out.println(pChild.compararTamanio(perrito));
        }

        // Comparator<E> =====> Comparator<Perro>
        DogComparator dc = new DogComparator();
        for (Perro perrito : perros) {
            System.out.println(dc.compararTamanio(pChild, perrito));
        }

    }
}
