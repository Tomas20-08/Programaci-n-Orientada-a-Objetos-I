package Principios_POO;

import javax.swing.JOptionPane;

public class Ejercicio04_Get_Set {

    //Clase Calculo
    static class Calculo{
        
        private double numero;
        
         public Calculo(){
        }
        
        public double getNumero() {
            return numero;
        }

        public void setNumero1(double numero) {
            this.numero = numero;
        }
        
        public void DiferenciarSigno(){
            
             
            //Numero 1 es el mayor     
            if(numero>0){
                System.out.println("El numero es positivo");
}               else if(numero==0){
                System.out.println("El numero es 0, no aplica en este caso");
               
                         }else{
                            System.out.println("El numero es negativo");       
                                }    
            
        System.out.println("----------------------------------------");       
        
        }
    }
    
    public static void main(String[] args) {
        
        Calculo si = new Calculo();
        
        si.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese un Numero")));
        
        System.out.println("Numero Ingresado: " + si.getNumero());
                
        si.DiferenciarSigno();
        
    }  
}
