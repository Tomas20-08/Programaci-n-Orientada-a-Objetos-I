
package Exam;

import javax.swing.JOptionPane;

public class Ejercicio01_ {
    
    //Clase Estudiante
    static class Estudiante{
        
    //Atributos
    
    private String nombre;
    private int edad;
    private String codigo;
    private double promedio;
    
     public Estudiante() {
        }
     
     //Constructor
     
        //Getter
        //Setter

        //nombre
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        //edad
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        
        //codigo
        public String getCodigo() {
            return codigo;
        }
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        
        //promedio
        
        public double getPromedio() {
            return promedio;
        }
        public void setPromedio(double promedio) {
            JOptionPane.showMessageDialog(null,"Promedio " + this.promedio);
            int confirmar = Integer.parseInt(JOptionPane.showInputDialog("¿Desea Cambiar el Promedio? Y(1) - N(0)"));
            if(confirmar == 0){
                this.promedio = promedio;
            }else{
                this.promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Promedio Nuevo Estudiante"));
            }
        }

        
            //Metodos
    
    public void mostrarInformacion(){
        System.out.println(" Nombre: " + nombre + " Edad: " + edad + " Codigo: " + codigo + " Promedio: " + promedio);
        JOptionPane.showMessageDialog(null," Nombre: " + nombre + " Edad: " + edad + " Codigo: " + codigo + " Promedio: " + promedio);
    }
    
    public boolean aprobo(){

        boolean prom;
        if(this.promedio >= 3.0){
            return prom = true;
        } else {
            return prom = false;
        }
    }
        
    }
    
    //Main
    
    public static void main(String[] args) {
        
        //Objetos
        
        Estudiante es = new Estudiante();
        
        //Objeto 1
        
        es.nombre = JOptionPane.showInputDialog("Ingrese Nombre Estudiante 1");
        es.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad Estudiante 1"));
        es.codigo = JOptionPane.showInputDialog("Ingrese Codigo Estudiante 1");
        es.promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Promedio Estudiante 1"));
        es.mostrarInformacion();
        if(es.aprobo() == true){
            System.out.println("APROBADO");
        }else
            System.out.println("REPROBADO");
        es.setPromedio(es.getPromedio());
        if(es.aprobo() == true){
            System.out.println("APROBADO");
        }else
            System.out.println("REPROBADO");
        
        //Objeto 2
        
        es.nombre = JOptionPane.showInputDialog("Ingrese Nombre Estudiante 2");
        es.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad Estudiante 2"));
        es.codigo = JOptionPane.showInputDialog("Ingrese Codigo Estudiante 2");
        es.promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Promedio Estudiante 2"));
        es.mostrarInformacion();
        if(es.aprobo() == true){
            System.out.println("APROBADO");
        }else
            System.out.println("REPROBADO");
        
        //Objeto 3
        
        es.nombre = JOptionPane.showInputDialog("Ingrese Nombre Estudiante 3");
        es.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad Estudiante 3"));
        es.codigo = JOptionPane.showInputDialog("Ingrese Codigo Estudiante 3");
        es.promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Promedio Estudiante 3"));
        es.mostrarInformacion();
        if(es.aprobo() == true){
            System.out.println("APROBADO");
        }else
            System.out.println("REPROBADO");
        
        
       
    }
    
}
