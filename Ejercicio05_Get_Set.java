package Principios_POO;

import javax.swing.JOptionPane;

public class Ejercicio05_Get_Set {

    //Clase Calculo
    static class Calculo{
        
        private double numero;
        
         public Calculo(){
        }
        
        public double getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }        
        
        public void DeterminarPar(){
   
            //Numero 1 es el mayor
            if (numero == 0){
                System.out.println("El numero es 0, no aplica");
            } else if(numero% 2 == 0){
               System.out.println("El numero "+numero+" es par");
                    } else {
                        System.out.println("El numero "+numero+" es impar");
                            }  
                               
                                  

        System.out.println("----------------------------------------");
            
        }
  
    }
    

    public static void main(String[] args) {
        
        Calculo si = new Calculo();
        
        si.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero")));
        
        System.out.println("Numero Ingresado: " + si.getNumero());
                
        si.DeterminarPar();
        
    }
    
}
