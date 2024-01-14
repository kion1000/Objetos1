package objetos1;

import java.util.ArrayList;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }

    public boolean validarDNI() {
    
    // Obtener número del DNI
    int numeroDNI = Integer.parseInt(dni.replaceAll("[^\\d]", ""));

    // Obtener la letra correspondiente al número del DNI usando tu método
    char letraCalculada = letraDNI(numeroDNI);

    // Comparar la letra calculada con la letra proporcionada
    return Character.toUpperCase(letraCalculada) == Character.toUpperCase(dni.charAt(dni.length() - 1));
}

    public static char letraDNI(int dni) {
        int letra = dni % 23;

        ArrayList<Character> letraDNI = new ArrayList<>();
        letraDNI.add('T');
        letraDNI.add('R');
        letraDNI.add('W');
        letraDNI.add('A');
        letraDNI.add('G');
        letraDNI.add('M');
        letraDNI.add('Y');
        letraDNI.add('F');
        letraDNI.add('P');
        letraDNI.add('D');
        letraDNI.add('X');
        letraDNI.add('B');
        letraDNI.add('N');
        letraDNI.add('J');
        letraDNI.add('Z');
        letraDNI.add('S');
        letraDNI.add('Q');
        letraDNI.add('V');
        letraDNI.add('H');
        letraDNI.add('L');
        letraDNI.add('C');
        letraDNI.add('K');
        letraDNI.add('E');

        return letraDNI.get(letra);
    }
}


