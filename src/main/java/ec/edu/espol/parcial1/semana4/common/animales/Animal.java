package ec.edu.espol.parcial1.semana4.common.animales;

public class Animal {
    private String nombre;
    private int edad;
    private String raza;
    private boolean cansado;

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

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setEdad(int edad) {
        this.edad = edad;
    }

    protected void setRaza(String raza) {
        this.raza = raza;
    }

    protected void setCansado(boolean cansado) {
        this.cansado = cansado;
    }

    protected void updateFields(Animal a) {
        this.nombre = a.getNombre();
        this.edad = a.getEdad();
        this.raza = a.getRaza();
    }

    public String jugar(Animal a) {
        return "JUEGA";
    }
}
