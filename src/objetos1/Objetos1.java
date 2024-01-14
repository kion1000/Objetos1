package objetos1;

import java.util.Scanner;


public class Objetos1 {

  
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String dni1;
        String nombre1;
        String apellidos1;
        int edad1;
        

        // Pedir datos para la primera persona
        System.out.println("Ingrese datos para la primera persona:");
        
        System.out.print("DNI: ");
        dni1 = s.nextLine();
        
        System.out.print("Nombre: ");
        nombre1 = s.nextLine();
        
        System.out.print("Apellido: ");
        apellidos1 = s.nextLine();
        
        System.out.print("Edad: ");
        edad1 = s.nextInt();

        // Crear objeto Persona para la primera persona
        Persona persona1 = new Persona(dni1, nombre1, apellidos1, edad1);

     
        String dni2;
        String nombre2;
        String apellidos2;
        int edad2;
        
        
        System.out.println("Ingrese datos para la segunda persona:");
        
        System.out.print("DNI: ");
        dni2 = s.next();
        
        System.out.print("Nombre: ");
        nombre2 = s.next();
        
        System.out.print("Apellido: ");
        apellidos2 = s.next();
        
        System.out.print("Edad: ");
        edad2 = s.nextInt();
        
        Persona persona2= new Persona(dni2,nombre2,apellidos2,edad2);
        
        
         
        System.out.println("\nDatos de la primera persona:");
        persona1.mostrarDatos();
        if (persona1.validarDNI()) {
            System.out.println("El DNI de la primera persona es válido.");
        } else {
            System.out.println("El DNI de la primera persona no es válido.");
        }
        
        
        System.out.println("\nDatos de la primera persona:");
        persona2.mostrarDatos();
        if (persona2.validarDNI()) {
            System.out.println("El DNI de la segunda persona es válido.");
        } else {
            System.out.println("El DNI de la segunda persona no es válido.");
        }

        
    }
}