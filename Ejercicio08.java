//8. Identifica en el código: clase, atributos, método, objeto, declaración e instanciación 

package Guia_Práctica_No_01;

public class Ejercicio08 {
    
    //Clase Carro
    static class Carro{ // <--- Clase (Carro)
        
        //Atributo
        String color; // <--- Atributo (Nombre)
        
    }

    public static void main(String[] args) {

        //Creamos el primer carro
        Carro c1 = new Carro();
        c1.color = "Rojo"; // <--- Instancia (c1) / Objeto 1
        
        //Creamos el segundo carro
        Carro c2 = new Carro();
        c2.color = "Azul"; // <--- Instancia (c2) / Objeto 2
        
        //Mostramos los colores
        System.out.println("Carro 1 es " + c1.color); // <--- Método (El Carro es de color Rojo)
        System.out.println("Carro 2 es " + c2.color); // <--- Método (El Carro es de Color Azul)
        //El método se encuentra en el main, no en la clase Carro.
    }
    
}
