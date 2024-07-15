package ec.edu.espol.parcial2.excepciones;


public class NotNumberException extends Exception {

    public NotNumberException(String errorMsg) {
        super(errorMsg);
    }

    public NotNumberException() {
        super("[X_X] No es un número!!");
    }
}
