//CLASES, ATRIBUTOS, MÉTODOS, OBJETOS. (El Usuario Ingresa Datos).

package Clases_Atributos_Metodos_Objetos;

import javax.swing.JOptionPane;

public class Ejemplo02_Clases_Atributos_Métodos_Objetos {

        static class Persona {
 
        // ATRIBUTOS (características)
        String nombre;
        int edad;
 
        // MÉTODO (acción o comportamiento)
        public void saludar() {
            System.out.println("Hola, mi Nombre es " + nombre + " y tengo " + edad + " Años.");
            JOptionPane.showMessageDialog(null,"Hola, mi Nombre es " + nombre + " y tengo " + edad + " Años.");
        }
    }
 
    public static void main(String[] args) {
 
        // OBJETO 1 (instancia de la clase Persona)
        Persona persona1 = new Persona();
        persona1.nombre = JOptionPane.showInputDialog("Ingrese Nombre de la Persona 1");
        persona1.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad de la Persona 1"));
        persona1.saludar();
 
        System.out.println("----------------------------------------");
 
        // OBJETO 2 (otra instancia de la misma clase)
        Persona persona2 = new Persona();
        persona2.nombre = JOptionPane.showInputDialog("Ingrese Nombre de la Persona 2");
        persona2.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad de la Persona 2"));
        persona2.saludar();
        
        System.out.println("----------------------------------------");
        
        // OBJETO 3 (otra instancia de la misma clase)
        Persona persona3 = new Persona();
        persona2.nombre = JOptionPane.showInputDialog("Ingrese Nombre de la Persona 3");
        persona2.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad de la Persona 3"));
        persona2.saludar();
        
    }
}