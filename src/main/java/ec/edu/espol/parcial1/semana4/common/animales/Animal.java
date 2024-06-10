package ec.edu.espol.parcial1.semana4.common.animales;

public class Animal {
    private String nombre;
    private int edad;
    private String raza;
    private boolean cansado;
    private String nombre1;
    private int edad1;
    private String raza1;

    public Animal() {
        this("Firulais", 5, "Corgi");
    }

    public Animal(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.cansado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isCansado() {
        return cansado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setCansado(boolean cansado) {
        this.cansado = cansado;
    }

    public void setAnimalProperties(String nombre, int edad, String raza) {
        this.nombre1 = nombre;
        this.edad1 = edad;
        this.raza1 = raza;
    }
}
