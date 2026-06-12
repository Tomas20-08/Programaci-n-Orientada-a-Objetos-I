//4. Elige UNA de las siguientes opciones y créala en Java

//Opción a:  Libro
//Atributos: titulo, autor, paginas.
//Metodo: mostrarInformación.
//Objetos: Crear 2 Objetos en el main.

package Guia_Práctica_No_01;

import javax.swing.JOptionPane;

public class Ejercicio04 {
    
    //CLASE
    
    static class Libro {
        
        //ATRIBUTOS
        
        String titulo;
        String autor;
        int paginas;
        
        //MÉTODOS
        
        public void mostrarInformacion(){
            
            System.out.println("Titulo: " + titulo + " Autor: " + autor + " Páginas: " + paginas);
            JOptionPane.showMessageDialog(null,"Titulo: " + titulo + " Autor: " + autor + " Páginas: " + paginas);
            
        }
        
    }

    public static void main(String[] args) {
        
        //OBJETO 1
        
        Libro libro1 = new Libro();
        libro1.titulo = JOptionPane.showInputDialog("Ingrese Titulo del Libro 1");
        libro1.autor = JOptionPane.showInputDialog("Ingrese Autor del Libro 1");
        libro1.paginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad Paginas Libro 1"));
        libro1.mostrarInformacion();
        
        System.out.println("----------------------------------------");
        
        //OBJETO 2
        
        Libro libro2 = new Libro();
        libro2.titulo = JOptionPane.showInputDialog("Ingrese Titulo del Libro 2");
        libro2.autor = JOptionPane.showInputDialog("Ingrese Autor del Libro 2");
        libro2.paginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad Paginas Libro 2"));
        libro2.mostrarInformacion();
        
       
    }
    
}
