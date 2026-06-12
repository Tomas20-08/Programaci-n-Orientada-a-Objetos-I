//9.  Cambiar a que el usuario ingrese los datos. 3 atributos, 2 métodos y 3 objetos. (Punto a)

//Codigo Original

// Clase Ciudad
//class Ciudad{

//Atributo
//String nombre;

//}

//public class Main{
    //public static void main (Strings[] args){

        //Creamos la primera ciudad
        //Ciudad c1 = new Ciudad();
        //c1.nombre = "Bogota";

        //Creamos la segunda ciudad
        //Ciudad c2 = new Ciudad();
        //c2.nombre = "Medellín";

        //Mostramos los nombres de las ciudades
        //System.out.println("Ciudad 1: " + c1.nombre);
        //System.out.println("Ciudad 2: " + c2.nombre);
        

//Codigo Modificado

package Guia_Práctica_No_01;

import javax.swing.JOptionPane;

public class Ejercicio09_Punto_A {
    
   //CLASE (ciudad)
        static class Ciudad {
 
        // ATRIBUTOS
        String nombre;
        String pais;
        int poblacion;
 
        // MÉTODO 1
        public void mostrarInformacion() {
            System.out.println("Nombre:" + nombre + " País: " + pais + " Población: " + poblacion); 
            JOptionPane.showMessageDialog(null,"Nombre:" + nombre + " País: " + pais + " Población: " + poblacion);
            
   
        }
        
        // MÉTODO 2
        public static void compararPoblacion(int p1, int p2, int p3){
            
             double may=0,med=0,men=0;
             
//Poblacion Ciudad 1 es la mayor     
if(p1>p2){
        if(p1>p3){
            may = p1;  
                if(p2>p3){
                    med=p2;
                    men=p3;
                         }else{
                            med=p3;    
                            men=p2;       
                                }    
                               }
                              }     
//Poblacion Ciudad 2 es la mayor
if(p2>p3){
        if(p2>p1){
            may = p2;
                if(p1>p3){
                    med=p1;
                    men=p3;
                         }else{
                            med=p3;  
                            men=p1;    
                               }
                              }            
                             }     
//Poblacion Ciudad 3 es la mayor
if(p3>p2){
        if(p3>p1){
            may = p3;
                if(p1>p2){
                   med=p1;
                   men=p2;        
                        }else{
                            med=p2;
                            men=p1;        
                              }
                             }    
                            }

        System.out.println("----------------------------------------");

        System.out.println("Poblacion Mayor: "+may);
        System.out.println("Poblacion Media: "+med);
        System.out.println("Poblacion Menor: "+men);
            
        }
    }
 
    public static void main(String[] args) {
 
        // OBJETO 1
        Ciudad ciudad1 = new Ciudad();
        ciudad1.nombre = JOptionPane.showInputDialog("Ingrese Nombre de la Ciudad 1");
        ciudad1.pais = JOptionPane.showInputDialog("Ingrese Pais donde esta la Ciudad 1");
        ciudad1.poblacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Población de la Ciudad 1"));
        ciudad1.mostrarInformacion();
 
        System.out.println("----------------------------------------");
 
        // OBJETO 2
        Ciudad ciudad2 = new Ciudad();
        ciudad2.nombre = JOptionPane.showInputDialog("Ingrese Nombre de la Ciudad 2");
        ciudad2.pais = JOptionPane.showInputDialog("Ingrese Pais donde esta la Ciudad 2");
        ciudad2.poblacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Población de la Ciudad 2"));
        ciudad2.mostrarInformacion();
        
        System.out.println("----------------------------------------");
        
        // OBJETO 3
        Ciudad ciudad3 = new Ciudad();
        ciudad3.nombre = JOptionPane.showInputDialog("Ingrese Nombre de la Ciudad 3");
        ciudad3.pais = JOptionPane.showInputDialog("Ingrese Pais donde esta la Ciudad 3");
        ciudad3.poblacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Población de la Ciudad 3"));
        ciudad3.mostrarInformacion();
        
        //MÉTODO 2
        Ciudad.compararPoblacion(ciudad1.poblacion, ciudad2.poblacion, ciudad3.poblacion);
        
    }
}


