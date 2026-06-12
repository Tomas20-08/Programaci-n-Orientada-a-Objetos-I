
package Encapsulamiento;

import java.util.Scanner;

public class Ejercicio04_SistemaEstudiantes {

     //CLASE ESTUDIANTE
     static class Estudiante {
     
         // ATRIBUTOS (ENCAPSULADOS)
        
        private String nombre;
        private double nota1;
        private double nota2;
        private double nota3;
        
         // CONSTRUCTOR (Que permite inicializar la clase)
     
        public Estudiante() {
        }
        
        //METODOS GET Y SET
        
        public String getnombre(){
            return nombre;  // Devuelve el valor del atributo nombre
        }
        // Método set para asignar un nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;  // Asigna el valor recibido al atributo de la clase
        }
        public double getNota1(){
            return nota1;  
        }
        public void setNota1(double nota1) {
            if (nota1 < 0) {
                System.out.println("La nota no puede ser menor a 0");
                this.nota1 = 0;
            } else if (nota1 > 5) {
                System.out.println("La nota no puede ser mayor a 5");
                this.nota1 = 5;
            } else {
                this.nota1 = nota1;
        }
        }
       
        public double getNota2(){
            return nota2;  
        }
        public void setNota2(double nota2) {
            if (nota2 < 0) {
                System.out.println("La nota no puede ser menor a 0");
                this.nota2 = 0;
            } else if (nota2 > 5) {
                System.out.println("La nota no puede ser mayor a 5");
                this.nota2 = 5;
            } else {
                this.nota2 = nota2;
        }
        } 
        
        public double getNota3(){
            return nota3;  
        }
        public void setNota3(double nota3) {
            if (nota3 < 0) {
                System.out.println("La nota no puede ser menor a 0");
                this.nota3 = 0;
            } else if (nota3 > 5) {
                System.out.println("La nota no puede ser mayor a 5");
                this.nota3 = 5;
            } else {
                this.nota3 = nota3;
        }
        }

        public double calcularPromedio() {
            double Promedio = (nota1 + nota2 + nota3)/3;
            return Promedio;
        }
        
     }
    public static void main(String[] args) {
       
        Scanner si = new Scanner (System.in);

        Estudiante estudiante1 = new Estudiante();
     
        System.out.println("Ingrese el nombre del estudiante: ");
        estudiante1.nombre = si.next();
        
        System.out.println("Ingrese la nota #1 de "+estudiante1.nombre);
        estudiante1.setNota1(si.nextDouble());
        
        System.out.println("Ingrese la nota #2 de "+estudiante1.nombre);
        estudiante1.setNota2(si.nextDouble());
        
        System.out.println("Ingrese la nota #3 de "+estudiante1.nombre);
        estudiante1.setNota3(si.nextDouble());

        System.out.println("El promedio de " + estudiante1.nombre + " es: " + estudiante1.calcularPromedio());

    }
    
}
     
