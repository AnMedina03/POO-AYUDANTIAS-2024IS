package ec.edu.espol.parcial1.semana4.common.animales;

public class Gato extends Animal {
    private boolean cazador;

    public Gato(String nombre, int edad, String raza, boolean cazador) {
        super(nombre, edad, raza);
        this.cazador = cazador;
    }

    public Gato(boolean cazador) {
        this("Goldo", 4, "Romano", true);
    }

    public Gato(Animal a, boolean cazador) {
        this.updateFields(a);
    }

    public boolean isCazador() {
        return cazador;
    }

    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }
    
    @Override
    public String jugar(Animal a) {
         return this.getNombre() + " juega con " + a.getNombre() + "pero se aburren";
    }

    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        else if (o == this) return true;
        else if (o.getClass() != this.getClass()) return false;
        Gato e = (Gato) o; // Downcasting
        // boolean c1 = e.getNombre().equals(this.getNombre());
        // boolean c2 = e.getEdad() >= this.getEdad();
        // boolean c3 = e.getRaza().equals(this.getRaza());
        // return c1 && c2 && c3;
        return e.getNombre().equals(this.getNombre()) && e.getEdad() >= this.getEdad()
        && e.getRaza().equals(this.getRaza());
    }
}
