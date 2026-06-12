
package Encapsulamiento;

import java.util.Scanner;

public class Ejercicio01_ClasePersona {

    static class Persona {
        // ATRIBUTOS PRIVADOS
        private String nombre;
        private int edad;
        private String ciudad;

        public Persona() {
        }

        // MÉTODOS GET Y SET
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            if (edad < 0) {
                System.out.println("La edad no puede ser negativa");
                this.edad = 0;
            } else {
                this.edad = edad;
            }
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public void mostrarInformacion() {
            System.out.println(nombre + " tiene " + edad + " años y vive en " + ciudad);
        }
    }

    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        Persona persona1 = new Persona();

        System.out.println("Ingrese el nombre ");
        persona1.setNombre(si.next());

        System.out.println("Ingrese la edad de " + persona1.getNombre());

        persona1.setEdad(si.nextInt());

        System.out.println("Ingrese la ciudad de " + persona1.getNombre());
        persona1.setCiudad(si.next());

        persona1.mostrarInformacion();


    }
    
}
