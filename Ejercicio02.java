//2. Crea una nueva clase llamada animal con:
//Crea la clase Animal:
//Debe tener:
//Atributos: nombre, raza, edad
//Método: mostrarInformacion()
//En el main: crea 2 objetos pidiendo los datos al usuario.

package Guia_Práctica_No_01;

import javax.swing.JOptionPane;

public class Ejercicio02 {
    
    //CLASE
    
    static class Animal {
        
        //ATRIBUTOS
        
        String nombre;
        String raza;
        String edad;
        
        //METODO
        
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + " Raza: " + raza + " Edad: " + edad);
            JOptionPane.showMessageDialog(null," Nombre: " + nombre + " Raza: " + raza + " Edad: " + edad);
        
    }
        
    }

    public static void main(String[] args) {
        
        //OBJETO 1
        
        Animal animal1 = new Animal();
        animal1.nombre = JOptionPane.showInputDialog("Ingrese Nombre del Animal 1");
        animal1.raza = JOptionPane.showInputDialog("Ingrese Raza del Animal 1");
        animal1.edad =JOptionPane.showInputDialog("Ingrese la Edad del Animal 1");
        animal1.mostrarInformacion();
        
         System.out.println("----------------------------------------");
 
        // OBJETO 2
        
        Animal animal2 = new Animal();
        animal2.nombre = JOptionPane.showInputDialog("Ingrese Nombre del Animal 2");
        animal2.raza = JOptionPane.showInputDialog("Ingrese Raza del Animal 2");
        animal2.edad = JOptionPane.showInputDialog("Ingrese la Edad del Animal 2");
        animal2.mostrarInformacion();
        
        //Objeo 3
        
        System.out.println("----------------------------------------");
        
        Animal animal3 = new Animal();
        animal3.nombre = JOptionPane.showInputDialog("Ingrese Nombre del Animal 3");
        animal3.raza = JOptionPane.showInputDialog("Ingrese Raza del Animal 3");
        animal3.edad = JOptionPane.showInputDialog("Ingrese la Edad del Animal 3");
        animal3.mostrarInformacion();
    }
    
}
