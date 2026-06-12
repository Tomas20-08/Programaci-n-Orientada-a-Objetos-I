    //6. Dar un ejemplo real para cada concepto. 
    //Clase: Carro
    //Objeto: Carro1 (Dodge Viper) , Carro2 (Roll Royce) , Carro3 (Bugatti)
    //Atributo: Marca, Modelo, Color, Velocidad Inicial, Vlocidad Final, Distancia
    //Método: mostrarInformación(), calcularTiempo(), aceleración()
    //Instanciar: Carro carro1 = new Carro();



    //Ejemplo Aplicado En Programación

    package Guia_Práctica_No_01;

    import javax.swing.JOptionPane;

    public class Ejercicio06 {

        //CLASE
        static class Carro{ 

            //ATRIBUTO
            String marca;
            String modelo;
            String color;
            int velocidadInicial;
            int velocidadFinal;
            double distancia;

            //MÉTODOS
             public void mostrarInformacion() {
                System.out.println("Marca:" + marca +" Modelo: " + modelo + "  /Color " + color + "  /Velocidad Inicial " + velocidadInicial + "  /Velocidad Final " + velocidadFinal + "  /Distancia a Recorrer " + distancia);
                JOptionPane.showMessageDialog(null,"Marca:" + marca +" Modelo: " + modelo + " / Color " + color + " / Velocidad Inicial " + velocidadInicial + " / Velocidad Final " + velocidadFinal + " / Distancia a Recorrer " + distancia);

            }
             public static void calcularTiempo(double d1, int vi1, int vf1, double d2, int vi2, int vf2, double d3, int vi3, int vf3) {

                 // Se aplica una formula Basica usando 2 variables Distancia y Velocidad

                 //Calcular Velocidad Promedio

                 double p1 = (vi1+vf1)/2;

                 double p2 = (vi2+vf2)/2;

                 double p3 = (vi3+vf3)/2;

                 // tiempo = distancia / velocidad;

                 double tiempo1 = d1 / p1;

                 double tiempo2 = d2 / p2;

                 double tiempo3 = d3 / p3;

                 System.out.println("----------------------------------------");

                 System.out.println("Tiempo que tardara en recorrer el Carro 1 " + d1 + "km es: " + tiempo1 + " horas");
                 JOptionPane.showMessageDialog(null,"Tiempo que tardara en recorrer el Carro 1 " + d1 + "km es: " + tiempo1 + " horas");

                 System.out.println("----------------------------------------");

                 System.out.println("Tiempo que tardara en recorrer el Carro 2 " + d2 + "km es: " + tiempo2 + " horas");
                 JOptionPane.showMessageDialog(null,"Tiempo que tardara en recorrer el Carro 2 " + d2 + "km es: " + tiempo1 + " horas");

                 System.out.println("----------------------------------------");

                 System.out.println("\"Tiempo que tardara en recorrer el Carro 3 " + d3 + "km es: " + tiempo3 + " horas");
                 JOptionPane.showMessageDialog(null,"Tiempo que tardara en recorrer el Carro 3 " + d3 + "km es: " + tiempo1 + " horas");

                 System.out.println("----------------------------------------");
            }

             public static void aceleracion() {

                 // Se aplica la formula de la aceleración con las variables VelocidadInicial, VelocidadFinal, tiempo

                 // acelaración = (velocidadFinal - velocidadInicial) / tiempo
            }

    }

        public static void main(String[] args) {

            //OBJETO 1
            Carro c1 = new Carro();
            c1.marca = JOptionPane.showInputDialog("Ingrese Marca del Carro 1");
            c1.modelo = JOptionPane.showInputDialog("Ingrese Modleo del Carro 1");
            c1.color = JOptionPane.showInputDialog("Ingrese Color del Carro 1");
            c1.velocidadInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Velocidad Inicial del Carro 1 en km/h"));
            c1.velocidadFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Velocidad Final del Carro 1 en km/h"));
            c1.distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Distancia a Recorrer del Carro 1 en km"));
            c1.mostrarInformacion();

            System.out.println("----------------------------------------");

            //OBJETO 2
            Carro c2 = new Carro();
            c2.marca = JOptionPane.showInputDialog("Ingrese Marca del Carro 2");
            c2.modelo = JOptionPane.showInputDialog("Ingrese Modleo del Carro 2");
            c2.color = JOptionPane.showInputDialog("Ingrese Color del Carro 2");
            c2.velocidadInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Velocidad Inicial del Carro 2 en km/h"));
            c2.velocidadFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Velocidad Final del Carro 2 en km/h"));
            c2.distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Distancia a Recorrer del Carro 2 en km"));
            c2.mostrarInformacion();

            System.out.println("----------------------------------------");

            //OBJETO 1
            Carro c3 = new Carro();
            c3.marca = JOptionPane.showInputDialog("Ingrese Marca del Carro 3");
            c3.modelo = JOptionPane.showInputDialog("Ingrese Modleo del Carro 3");
            c3.color = JOptionPane.showInputDialog("Ingrese Color del Carro 3");
            c3.velocidadInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Velocidad Inicial del Carro 3 en km/h"));
            c3.velocidadFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Velocidad Final del Carro 3 en km/h"));
            c3.distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Distancia a Recorrer del Carro 3 en km"));
            c3.mostrarInformacion();

            //Metodo 1


            //Metodo 2
            Carro.calcularTiempo(c1.distancia,c1.velocidadInicial,c1.velocidadFinal,c2.distancia,c2.velocidadInicial,c2.velocidadFinal,c3.distancia,c3.velocidadInicial,c3.velocidadFinal);

        }

    }