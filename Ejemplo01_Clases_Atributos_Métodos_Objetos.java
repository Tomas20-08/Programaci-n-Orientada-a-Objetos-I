//CLASES, ATRIBUTOS, MÉTODOS, OBJETOS.

package Clases_Atributos_Metodos_Objetos;

public class Ejemplo01_Clases_Atributos_Métodos_Objetos {

        static class Persona {
 
        // ATRIBUTOS (características)
        String nombre;
        int edad;
 
        // MÉTODO (acción)
        public void saludar() {
            System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
        }
    }
 
    public static void main(String[] args) {
 
        // OBJETO 1 (instancia de la clase Persona)
        Persona persona1 = new Persona();
        persona1.nombre = "Ana";
        persona1.edad = 25;
        persona1.saludar();
 
        System.out.println("--------------------");
 
        // OBJETO 2 (otra instancia de la misma clase)
        Persona persona2 = new Persona();
        persona2.nombre = "Carlos";
        persona2.edad = 30;
        persona2.saludar();
        
    }
}

