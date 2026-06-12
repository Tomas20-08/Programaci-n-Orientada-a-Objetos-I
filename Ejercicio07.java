//7.  Inventar una clase propia con 3 atributos, 1 método y 3 objetos. 

package Guia_Práctica_No_01;

import javax.swing.JOptionPane;

public class Ejercicio07 {
    
//CLASE
    
    static class ReservaPiano{
        
        //ATRIBUTOS
        
        String titular;
        String fecha;
        String tipo;
        
        //METODO
        
        public void mostrarInformacion() {
            System.out.println("Titular: " + titular + " Fecha: " + fecha + " Tipo: " + tipo);
            JOptionPane.showMessageDialog(null,"Titular: " + titular + " Fecha: " + fecha + " Tipo: " + tipo);
        
       }
        
    }

    public static void main(String[] args) {
        
        //OBJETO 1
        ReservaPiano reserva1 = new ReservaPiano();
        reserva1.titular = JOptionPane.showInputDialog("Ingrese Nombre del titular de la Reserva 1");
        reserva1.fecha = JOptionPane.showInputDialog("Ingrese Fecha de la Reserva 1 (dd/mm/yyyy)");
        reserva1.tipo =JOptionPane.showInputDialog("Ingrese Tipo de Cabina (Acústico / Eléctrico) del la Reserva 1");
        reserva1.mostrarInformacion();
        
         System.out.println("----------------------------------------");
 
        // OBJETO 2
        ReservaPiano reserva2 = new ReservaPiano();
        reserva2.titular = JOptionPane.showInputDialog("Ingrese Nombre del titular de la Reserva 1");
        reserva2.fecha = JOptionPane.showInputDialog("Ingrese Fecha de la Reserva 1 (dd/mm/yyyy)");
        reserva2.tipo =JOptionPane.showInputDialog("Ingrese Tipo de Cabina (Acústico / Eléctrico) del la Reserva 1");
        reserva2.mostrarInformacion();
        
        //Objeo 3
        System.out.println("----------------------------------------");
        
        ReservaPiano reserva3 = new ReservaPiano();
        reserva3.titular = JOptionPane.showInputDialog("Ingrese Nombre del titular de la Reserva 1");
        reserva3.fecha = JOptionPane.showInputDialog("Ingrese Fecha de la Reserva 1 (dd/mm/yyyy)");
        reserva3.tipo =JOptionPane.showInputDialog("Ingrese Tipo de Cabina (Acústico / Eléctrico) del la Reserva 1");
        reserva3.mostrarInformacion();
    }
    
}
