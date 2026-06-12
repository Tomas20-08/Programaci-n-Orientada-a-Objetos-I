//9.  Cambiar a que el usuario ingrese los datos. 3 atributos, 2 métodos y 3 objetos. (Punto b)

    //Codigo Original

    // Clase Pelicula
    //class Pelicula{

    //Atributo
    //String titulo;

    //}

    //public class Main{
        //public static void main (Strings[] args){

            //Creamos una pelicula
            //Pelicula p1 = new Pelicula();
            //p1.nombre = "Avatar";
            //p1.año = "2009"

            //Mostramos los datos
            //System.out.println("Pelicula: " + p1.titulo + " (" + p1.año + ") ");


    //Codigo Modificado

    package Guia_Práctica_No_01;

    import javax.swing.JOptionPane;

    public class Ejercicio09_Punto_B {

       //CLASE (pelicula)
            static class Pelicula {

            // ATRIBUTOS
            String titulo;
            String productora;
            int año;

            // MÉTODO 1
            public void mostrarInformacion() {
                System.out.println("Pelicula:" + titulo + " Productora: " + productora + " año: " + año); 
                JOptionPane.showMessageDialog(null,"Pelicula:" + titulo + " Productora: " + productora + " año: " + año);  
            }
            // MÉTODO 2
            public static void añosPeliculas(int a1, int a2, int a3){

                 double may=0,med=0,men=0;

    //Poblacion Ciudad 1 es la mayor     
    if(a1>a2){
            if(a1>a3){
                may = a1;  
                    if(a2>a3){
                        med=a2;
                        men=a3;
                             }else{
                                med=a3;    
                                men=a2;       
                                    }    
                                   }
                                  }     
    //Poblacion Ciudad 2 es la mayor
    if(a2>a3){
            if(a2>a1){
                may = a2;
                    if(a1>a3){
                        med=a1;
                        men=a3;
                             }else{
                                med=a3;  
                                men=a1;    
                                   }
                                  }            
                                 }     
    //Poblacion Ciudad 3 es la mayor
    if(a3>a2){
            if(a3>a1){
                may = a3;
                    if(a1>a2){
                       med=a1;
                       men=a2;        
                            }else{
                                med=a2;
                                men=a1;        
                                  }
                                 }    
                                }

            System.out.println("----------------------------------------");                    

            System.out.println("Año Pelicula mas Nueva: "+may);
            System.out.println("Año Pelicula Media: "+med);
            System.out.println("Año Pelicula mas Antigua: "+men);

            }
        }

        public static void main(String[] args) {

            // OBJETO 1
            Pelicula pelicula1 = new Pelicula();
            pelicula1.titulo = JOptionPane.showInputDialog("Ingrese Titulo de la Pelicula 1");
            pelicula1.productora = JOptionPane.showInputDialog("Ingrese Productora de la Pelicula 1");
            pelicula1.año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de salida Pelicula 1"));
            pelicula1.mostrarInformacion();

            System.out.println("----------------------------------------");

            // OBJETO 2
            Pelicula pelicula2 = new Pelicula();
            pelicula2.titulo = JOptionPane.showInputDialog("Ingrese Titulo de la Pelicula 2");
            pelicula2.productora = JOptionPane.showInputDialog("Ingrese Productora de la Pelicula 2");
            pelicula2.año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de salida Pelicula 2"));
            pelicula2.mostrarInformacion();

            System.out.println("----------------------------------------");

            // OBJETO 3
            Pelicula pelicula3 = new Pelicula();
            pelicula3.titulo = JOptionPane.showInputDialog("Ingrese Titulo de la Pelicula 3");
            pelicula3.productora = JOptionPane.showInputDialog("Ingrese Productora de la Pelicula 3");
            pelicula3.año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de salida Pelicula 3"));
            pelicula3.mostrarInformacion();

            //MÉTODO 2
            Pelicula.añosPeliculas(pelicula1.año, pelicula2.año, pelicula3.año);

        }
    }
