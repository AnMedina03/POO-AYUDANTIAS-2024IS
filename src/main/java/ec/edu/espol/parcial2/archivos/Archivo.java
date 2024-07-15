package ec.edu.espol.parcial2.archivos;

import java.io.*;
import ec.edu.espol.animales.*;
import java.util.Scanner;

import ec.edu.espol.parcial2.excepciones.NotNumberException;

public class Archivo {
    public static void main(String[] args) {
        try {
            writeFile("perros.txt");
        } catch (IOException e) {
            System.out.println("NO SE HA PODIDO ESCRIBIR EN EL ARCHIVO");
        }
        readExampleFile("perros.txt");
    }

    public static void writeFile(String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            try (Scanner sc = new Scanner(System.in)) {
                String str = "N";
                do {
                    try {
                        System.out.print("Ingresa el nombre de tu perro");
                        String nombre = sc.nextLine();
                        System.out.print("Ingresa la edad de tu perro");
                        String edadStr = sc.nextLine();
                        int edad = parseToInt(edadStr);
                        System.out.print("Ingresa la raza de tu perro");
                        String raza = sc.nextLine();
                        Animal a = new Perro(nombre, edad, raza);
                        bw.write(a.toString());
                    }
                    catch(NotNumberException ex) {
                        System.out.println(ex.getMessage());
                    }
                    catch(Exception ex) {
                        System.out.println("NO SE CUAL HA SIDO EL PROBLEMA");
                    }
                    str =  sc.nextLine();
                } while(!str.toUpperCase().equals("N") && !str.toUpperCase().equals("NO"));
            }
        }
    }

    public static void writeExampleFile(String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            int valor = 0;
            int contador = 1;
            try (Scanner sc = new Scanner(System.in)) {
                do {
                    try {
                        System.out.print("Ingresa tu número");
                        String str = sc.nextLine();
                        if (str.toUpperCase().equals("N") || str.toUpperCase().equals("NO")) {
                            valor = Integer.MIN_VALUE;
                        }
                        else {
                            valor = parseToInt(str);
                            bw.write("Número " + valor + " escrito en la vuelta " + contador++ + "\n");
                        }
                    }
                    catch(NotNumberException ex) {
                        System.out.println(ex.getMessage());
                    }
                    catch(Exception ex) {
                        System.out.println("NO SE CUAL HA SIDO EL PROBLEMA");
                    }
                } while(valor > Integer.MIN_VALUE);
            }
        }
    }

    public static void readExampleFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
                sb.append(line);
                sb.append("\n");
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println(ex.getClass());
        }
        finally {
            String str = sb.toString();
            System.out.println(str);
        }
    }


    public static int parseToInt(String number) throws NotNumberException {
        try {
            int n = Integer.parseInt(number);
            return n;
        }
        catch(NumberFormatException ex) {
            throw new NotNumberException();
        }
    }
}
