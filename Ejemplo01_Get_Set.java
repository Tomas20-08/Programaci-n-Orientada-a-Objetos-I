//Get & Set en POO

package Principios_POO;

import java.time.LocalDate;

public class Ejemplo01_Get_Set {

    // Clase Persona dentro del mismo archivo
    static class Persona {

        private String nombre;
        private int edad;

        public Persona() {
        }

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
            this.edad = edad;
        }

        public String calcularMayoriaEdad() {
            if (edad >= 18) {
                return "mayor de edad";
            } else {
                return "menor de edad";
            }
        }

        public int calcularAnioNacimiento() {
            int anioActual = LocalDate.now().getYear();
            return anioActual - edad;
        }
    }

    // Método principal
    public static void main(String[] args) {

        Persona objetoPersona = new Persona();
        objetoPersona.setNombre("Juan David");
        objetoPersona.setEdad(25);

        System.out.println("El sr " + objetoPersona.getNombre());
        System.out.println("cuya edad es " + objetoPersona.getEdad());
        System.out.println("es " + objetoPersona.calcularMayoriaEdad());
        System.out.println("Ud nació en " + objetoPersona.calcularAnioNacimiento());
    }
}


