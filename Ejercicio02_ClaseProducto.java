
package Encapsulamiento;

import java.util.Scanner;

public class Ejercicio02_ClaseProducto {

    static class PRODUCTO1{
            
            private String nombreProducto;
            private double precio;
            private int stock;
         public  PRODUCTO1(){
        }
            // Metodo de get y set
        public String getNombreProducto() {
            return nombreProducto;  
        }
        public void setNombreProducto(String nombreProducto) {
            this.nombreProducto = nombreProducto;  
        }
        public double getPrecio() {
            return precio;  
        }
        public void setPrecio(Double precio) {
            this.precio = precio;
        }
        public int getStock() {
            return stock;  
        }
        public void setStock (int  stock ) {
            if( stock < 0){
                System.out.println(" El stock no puede ser negativo ");
                this.stock = 0;
            } else{
                this.stock = stock;
            }
        }   
            public void mostrarInformación (){
                System.out.println(nombreProducto + "tiene un  valor de " + precio + " y hay " + stock + " disponibles ");
            }
    }        
    public static void main(String[] args) {
        Scanner cosa =  new Scanner (System.in);
        PRODUCTO1 producto = new PRODUCTO1();
        
        System.out.println(" Ingrese el nombre del producto");
        producto.setNombreProducto(cosa.next());
        
        System.out.println(" Ingrese el precio de " + producto.getNombreProducto()+ ":");
        producto.setPrecio(cosa.nextDouble());
        
        System.out.println(" Ingrese la cantidad disponible de " + producto.getNombreProducto());
        producto.setStock(cosa.nextInt());
        
        producto.mostrarInformación();

    }
    
}
