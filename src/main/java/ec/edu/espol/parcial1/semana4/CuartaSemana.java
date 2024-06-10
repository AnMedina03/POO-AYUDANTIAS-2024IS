package ec.edu.espol.parcial1.semana4;

import java.util.ArrayList;

import ec.edu.espol.parcial1.semana4.common.animales.*;

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
        Animal a = new Animal("Firulais", 5, "Corgi");
        a.setAnimalProperties("Golde", 15, "Corgi");

        Animal p = new Perro("Firulais", 5, "Corgi", "PEQUENIO");
        Animal g = new Gato("Firulais", 5, "Corgi", true);

        Perro p1 = new Perro("Firulais", 5, "Corgi", "PEQUENIO");
        Gato g1 = new Gato("Firulais", 5, "Corgi", true);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(p);
        animals.add(g);
        animals.add(p1);
        animals.add(g1);
    }
}
