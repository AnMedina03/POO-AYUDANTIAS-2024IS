package ec.edu.espol.parcial1.semana4.common.animales;

public class Perro extends Animal {
    private String tamanio;

    public Perro() {}

    public Perro(String nombre, int edad, String raza, String tamanio) {
        super(nombre, edad, raza);
        this.tamanio = tamanio;
    }

    public Perro(String tamanio) {
        this("Firulais", 3, "Corgi", tamanio);
    }

    public void setPerroProperties(String nombre, int edad, String raza) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setRaza(raza);
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
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
