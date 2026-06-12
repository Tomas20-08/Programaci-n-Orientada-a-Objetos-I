//10.  Realice los ejercicio identificando la clase, los atributos, los métodos y los objetos. 
//Posteriormente, represente la clase mediante un Diagrama de Clases en UML. (Punto B)

//Métodos que retornan valores

package Guia_Práctica_No_01;
   
        import java.util.Scanner;

public class Ejercicio10_Punto_B {

    static class Operacion {

        public double sumar(double n1, double n2) {
            double resultado = n1 + n2;
            return resultado;
        }

        public double restar(double n1, double n2) {
            double resultado = n1 - n2;
            return resultado;
        }

        public double multiplicar(double n1, double n2) {
            double resultado = n1 * n2;
            return resultado;
        }

        public double dividir(double n1, double n2) {
            if (n2 != 0) {
                double resultado = n1 / n2;
                return resultado;
            } else {
                System.out.println("No se puede dividir entre cero");
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operacion op = new Operacion();

        System.out.print("Digite el primer número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite el segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("La suma es: " + op.sumar(n1, n2));
        System.out.println("La resta es: " + op.restar(n1, n2));
        System.out.println("La multiplicación es: " + op.multiplicar(n1, n2));
        System.out.println("La división es: " + op.dividir(n1, n2));

        sc.close();
    }
}
