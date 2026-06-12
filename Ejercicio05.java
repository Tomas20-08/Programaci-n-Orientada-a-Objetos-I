//5. Identificar y corregir el error en un código dado.

//package Guia_Práctica_No_01;

//public class Ejercicio05 {
    
    //static class Perro{
        //String nombre; <--- Atributo innecesario, no se le da uso.
        
        //public void ladrar(){
            //System.out.println("Guau");  <--- Falata el Atributo "nombre" 
        //}   
    //}
    //public static void main(String[] args) {
        //perro.p1; <--- Creacion erronea de Objeto e Instanciación
        //p1.ladrar(); <--- El Método no llama a nada, No hay Objeto
    //}
//}

//CODIGO CORREGIDO

package Guia_Práctica_No_01;

public class Ejercicio05 {
    
    //CLASE
    
    static class Perro{
        
        //ATRIBUTO
        
        String nombre; //<--- El Atributo ahora si se utiliza
        
        //MÉTODO
        
        public void ladrar(){
            System.out.println("Hola, Mi Nombre es " + nombre + " Guau!!"); //<--- Se llama bien al metodo y se agrega el atributo (nombre)  
        }   
    }
    
    public static void main(String[] args) {
        
        //OBEJTO 1 <--- Creación correcta del Objeto
        
        Perro p1 = new Perro(); //<--- Instanciación del Objeto
        p1.nombre = "Firulais"; //<--- Declaración del Atributo "Nombre"
        p1.ladrar(); //<--- Método "ladrar"

    }
    
}
