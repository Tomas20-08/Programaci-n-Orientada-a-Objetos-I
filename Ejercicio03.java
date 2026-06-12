//Identifica en el código: clase, atributos, método, objeto, declaración e instanciación.

package Guia_Práctica_No_01;

public class Ejercicio03 {
    
// Definimos unja clase llamada perro
static class Perro{ // <--- Clase (Perro)
    
    // Atributo de la calse Perro: nombre
    String nombre; // <--- Atributo (Nombre)
}
        public static void main(String[] args) {
        //Creamos un objeto (instancia) de la clase Perro
        Perro p1 = new Perro(); // <--- Instancia (p1) / Objeto 1
        
        //Asignamos un valor al atributo 'nombre' del objeto p1
        p1.nombre = "Firulais"; // <--- Declaración (Firulais)
        
        //Mostramos  en pantalla el nombre del perro
        System.out.println("El perro se llama: " + p1.nombre); // <--- Método (El perro se llama: Firulais)
        //El método se encuentra en el main, no en la clase Perro.
        
    }
    
  }
    

