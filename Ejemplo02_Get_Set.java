//1. Cree un programa OO que solicite dos numeros e imprima las
// operaciones matematicas básicas incluido el modulo.

package Principios_POO;

import javax.swing.JOptionPane;

public class Ejemplo02_Get_Set {
    
    //Clase Operacion
    static class Operacion{
        
        private double numero1;
        private double numero2;
        
        public Operacion(){
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

        public double suma() {
            double suma = numero1 + numero2;
            return suma;
        }

        public double resta() {
            double resta = numero1 - numero2;
            return resta;
        }
        
        public double multiplicacion() {
            double multiplicacion = numero1 * numero2;
            return multiplicacion;
        }
        
        public double division() {
            double division = (numero1 / numero2);
            return division;
            
        }
        
        public double modulo() {
            double modulo = (numero1 % numero2);
            return modulo;
            
        }

    }

    public static void main(String[] args) {
        
        Operacion op = new Operacion();
        
        op.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Numero 1")));
        op.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Numero 2")));
        
        System.out.println("Numero 1: " + op.getNumero1());
        System.out.println("Numero 2: " + op.getNumero2());
        
        System.out.println("");
        
        System.out.println("SUMA: " + op.suma());
        System.out.println("RESTA: " + op.resta());
        System.out.println("MULTIPLICACIÓN: " + op.multiplicacion());
        System.out.println("DIVISÓN: " + op.division());
        System.out.println("MODULO: " + op.modulo());
        
    }
    
}
