//2. Cree un programa OO que solicite tres números e imprima el
// mayor, el menor y el intermedio

package Principios_POO;

import javax.swing.JOptionPane;

public class Ejemplo03_Get_Set {
    
    //Clase Calculo
    static class Calculo{
        
        private double numero1;
        private double numero2;
        private double numero3;
        
         public Calculo(){
        }
        
        public double getNumero1() {
            return numero1;
        }

        public void setNumero1(double numero1) {
            this.numero1 = numero1;
        }

        public double getNumero2() {
            return numero2;
        }

        public void setNumero2(double numero2) {
            this.numero2 = numero2;
        }
        
        public double getNumero3() {
            return numero3;
        }

        public void setNumero3(double numero3) {
            this.numero3 = numero3;
        }
        
        public void OrdenNumeros(){
            
             double may=0,med=0,men=0;
             
//Numero 1 es el mayor     
if(numero1>numero2){
        if(numero1>numero3){
            may = numero1;  
                if(numero2>numero3){
                    med=numero2;
                    men=numero3;
                         }else{
                            med=numero3;    
                            men=numero2;       
                                }    
                               }
                              }     
//Numero 2 es el mayor    
if(numero2>numero3){
        if(numero2>numero1){
            may = numero2;
                if(numero1>numero3){
                    med=numero1;
                    men=numero3;
                         }else{
                            med=numero3;  
                            men=numero1;    
                               }
                              }            
                             }     
//Numero 3 es el mayor    
if(numero3>numero2){
        if(numero3>numero1){
            may = numero3;
                if(numero1>numero2){
                   med=numero1;
                   men=numero2;        
                        }else{
                            med=numero2;
                            men=numero1;        
                              }
                             }    
                            }

        System.out.println("----------------------------------------");

        System.out.println("Numero Mayor: "+may);
        System.out.println("Numero Medio: "+med);
        System.out.println("Numero Menor: "+men);
            
        }
  
    }
    

    public static void main(String[] args) {
        
        Calculo ca = new Calculo();
        
        ca.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Numero 1")));
        ca.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Numero 2")));
        ca.setNumero3(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Numero 3")));
        
        System.out.println("Numero 1: " + ca.getNumero1());
        System.out.println("Numero 2: " + ca.getNumero2());
        System.out.println("Numero 3: " + ca.getNumero3());
                
        ca.OrdenNumeros();
        
    }
    
}
