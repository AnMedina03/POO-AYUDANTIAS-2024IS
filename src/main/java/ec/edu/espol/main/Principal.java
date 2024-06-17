package ec.edu.espol.main;
import ec.edu.espol.parcial1.proyecto.mail.Mail;
import ec.edu.espol.parcial1.semana4.CuartaSemana;

public class Principal {
    public static void main(String[] args) {
        // CuartaSemana.main();
        Mail.inicializarSistemaCorreo();
        String feedback = Mail.sendMail("anmejaco@espol.edu.ec", "Prueba AYUDANTÍA 2024", "Una prueba rápida");
        System.out.println(feedback);
    }
}