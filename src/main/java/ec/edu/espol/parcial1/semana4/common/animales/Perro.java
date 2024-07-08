package ec.edu.espol.parcial1.semana4.common.animales;

import ec.edu.espol.parcial1.semana4.enums.DogSize;

public class Perro extends Animal implements Comparable<Perro> {
    private DogSize tamanio;

    public Perro() {}

    public Perro(String nombre, int edad, String raza, DogSize tamanio) {
        super(nombre, edad, raza);
        this.tamanio = tamanio;
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
        this.tamanio = DogSize.MEDIANO;
    }

    public Perro(DogSize tamanio) {
        this("Firulais", 3, "Corgi", tamanio);
    }

    public void setPerroProperties(String nombre, int edad, String raza) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setRaza(raza);
    }

    public DogSize getTamanio() {
        return tamanio;
    }

    public void setTamanio(DogSize tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String jugar(Animal a) {
        if (a instanceof Perro) {
            Perro p = (Perro) a;
            return this.getNombre() + " [Perro " + this.tamanio + "] juega con " + a.getNombre() + " [Perro" + p.tamanio + "]";
        }
        return "ES UN GATO";
    }

    @Override
    public void caminar() {
        System.out.println("El perro caminando");
    }

    @Override
    public void correr() {
        System.out.println("El perro corriendo");
    }

    @Override
    public void saltar() {
        System.out.println("El perro salta");
    }

    @Override
    public void observar() {
        System.out.println(this.getNombre() + " de tamaño " + this.tamanio + " está observando.");
    }

    @Override
    public int compareTo(Perro p) {
        if ((this.tamanio == DogSize.PEQUENIO) && (p.tamanio != DogSize.PEQUENIO)) return -1;
        else if ((this.tamanio == DogSize.MEDIANO) && (p.tamanio == DogSize.GRANDE)) return -1;
        else if ((this.tamanio == DogSize.MEDIANO) && (p.tamanio == DogSize.PEQUENIO)) return 1;
        else if ((this.tamanio == DogSize.GRANDE) && (p.tamanio != DogSize.GRANDE)) return 1;
        return 0;
    }

    public String compararTamanio(Perro p) {
        int comparacion = this.compareTo(p);
        switch (comparacion) {
            case 0:
                return "Son de igual tamaño";
            case -1:
                return this.getNombre() + " es más pequeño que " + p.getNombre();
            case 1:
                return this.getNombre() + " es más grande que " + p.getNombre();
            default:
                return "";
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        else if (o == this) return true;
        else if (o.getClass() != this.getClass()) return false;
        Perro e = (Perro) o; // Downcasting
        // boolean c1 = e.getNombre().equals(this.getNombre());
        // boolean c2 = e.getEdad() >= this.getEdad();
        // boolean c3 = e.getRaza().equals(this.getRaza());
        // return c1 && c2 && c3;
        return e.getNombre().equals(this.getNombre()) && e.getEdad() >= this.getEdad()
        && e.getRaza().equals(this.getRaza());
    }
}
