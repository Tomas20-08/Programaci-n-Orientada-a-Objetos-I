//10.  Realice los ejercicio identificando la clase, los atributos, los métodos y los objetos. 
//Posteriormente, represente la clase mediante un Diagrama de Clases en UML. (Punto A)

//Métodos que imprimen el resultado

package Guia_Práctica_No_01;

        import java.util.Scanner;

public class Ejercicio10_Punto_A{

    // Clase interna Operacion
    static class Operacion {

        public void sumar(double n1, double n2) {
            double resultado = n1 + n2;
            System.out.println("La suma es: " + resultado);
        }

        public void restar(double n1, double n2) {
            double resultado = n1 - n2;
            System.out.println("La resta es: " + resultado);
        }

        public void multiplicar(double n1, double n2) {
            double resultado = n1 * n2;
            System.out.println("La multiplicación es: " + resultado);
        }

        public void dividir(double n1, double n2) {
            if (n2 != 0) {
                double resultado = n1 / n2;
                System.out.println("La división es: " + resultado);
            } else {
                System.out.println("No se puede dividir entre cero");
            }
        }

        public void potencia(double n1) {
            double potencia = Math.pow(10, n1);
            System.out.println("10 elevado a " + n1 + " es: " + potencia);
        }

        public void promedio(double n1, double n2) {
            double prom = (n1 + n2) / 2;
            System.out.println("El promedio es: " + prom);
        }
    }

    // Método main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operacion op = new Operacion();

        System.out.print("Digite el primer número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite el segundo número: ");
        double n2 = sc.nextDouble();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.promedio(n1, n2);
        op.potencia(n1);

        sc.close();
    }
}
