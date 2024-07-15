package ec.edu.espol.animales;

import java.util.Comparator;

import ec.edu.espol.enums.DogSize;

public class DogComparator implements Comparator<Perro> {
    @Override
    public int compare(Perro p1, Perro p2) {
        if ((p1.getTamanio() == DogSize.PEQUENIO) && (p2.getTamanio() != DogSize.PEQUENIO)) return -1;
        else if ((p1.getTamanio() == DogSize.MEDIANO) && (p2.getTamanio() == DogSize.GRANDE)) return -1;
        else if ((p1.getTamanio() == DogSize.MEDIANO) && (p2.getTamanio() == DogSize.PEQUENIO)) return 1;
        else if ((p1.getTamanio() == DogSize.GRANDE) && (p2.getTamanio() != DogSize.GRANDE)) return 1;
        return 0;
    }

    public String compararTamanio(Perro p1, Perro p2) {
        int comparacion = this.compare(p1, p2);
        switch (comparacion) {
            case 0:
                return "Son de igual tamaño";
            case -1:
                return p1.getNombre() + " es más pequeño que " + p2.getNombre();
            case 1:
                return p1.getNombre() + " es más grande que " + p2.getNombre();
            default:
                return "";
        }
    }
}
