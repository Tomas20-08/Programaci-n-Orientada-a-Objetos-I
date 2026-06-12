//3. Cree un programa OO que solicite un numero de dos dígitos e
//imprima su inverso.

package Principios_POO;

import javax.swing.JOptionPane;

public class Ejercicio03_Get_Set {
    
    //Class Numero
    static class Numero{   
        
        private int numero;  
        
        public Numero(){
        }
        
        public void setNumero(int numero) {
            if (numero >= 10 && numero <= 99){
                this.numero = numero;
            } else {
                this.numero = 0;
                JOptionPane.showMessageDialog(null,"Numero Invalido");
            }
        }
        
        public int getNumero() {
            return numero;
        }
        
        
    public int invertir() {
        if (this.numero == 0) {
            return 0;
        } else {
            int decenas = this.numero / 10;
            int unidades = this.numero % 10;
            return (unidades * 10) + decenas;
        }
    }
    
    }

    public static void main(String[] args) {
        
        Numero num = new Numero();
        
        num.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de 2 digitos")));

        System.out.println("Numero Original: " + num.getNumero());
        System.out.println("Numero invertido: " + num.invertir());
        JOptionPane.showMessageDialog(null,"Numero Invertido: " + num.invertir());   
    }
    
}
