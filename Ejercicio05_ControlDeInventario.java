package Encapsulamiento;

import javax.swing.JOptionPane;

public class Ejercicio05_ControlDeInventario {

    static class Inventario {

        private String producto;
        private int cantidad;

        public Inventario() {
        }

        public String getProducto() {
            return producto;
        }

        public void setProducto(String producto) {
            this.producto = producto;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public void agregarStock(int cantidad) {
            if (cantidad > 0) {
                this.cantidad += cantidad;
                System.out.println("Se agregaron " + cantidad + " unidades de: " + producto);
            } else {
                System.out.println("La cantidad a agregar debe ser positiva");
            }
        }

        public void retirarStock(int cantidad) {
            if (cantidad <= 0) {
                System.out.println("La cantidad a retirar debe ser positiva");
                return;
            }
            if (cantidad > this.cantidad) {
                System.out.println("No se puede retirar " + cantidad + " unidades de " + producto + " Stock actual: " + this.cantidad);
            } else {
                this.cantidad -= cantidad;
                System.out.println("Se retiraron " + cantidad + " unidades de: " + producto);
            }
        }

        public void mostrarInformacion() {
            System.out.println("Producto: " + producto + " Cantidad: " + cantidad);
        }
    }

    public static void main(String[] args) {

        Inventario in1 = new Inventario();

        in1.setProducto(JOptionPane.showInputDialog("Ingrese nombre del Producto 1"));
        in1.setCantidad(Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese cantidad inicial del Producto 1")));
        in1.mostrarInformacion();

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción:  1. Agregar stock   2. Retirar stock   3. Salir"));

            if (opcion == 1) {
                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades a agregar"));
                in1.agregarStock(cant);
            } else if (opcion == 2) {
                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades a retirar"));
                in1.retirarStock(cant);
            } else {
                break;
            }
            in1.mostrarInformacion();
        }

        Inventario in2 = new Inventario();

        in2.setProducto(JOptionPane.showInputDialog("Ingrese nombre del Producto 2"));
        in2.setCantidad(Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese cantidad inicial del Producto 2")));
        in2.mostrarInformacion();

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una Opción:  1. Agregar stock   2. Retirar stock   3. Salir"));

            if (opcion == 1) {
                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades a agregar"));
                in2.agregarStock(cant);
            } else if (opcion == 2) {
                int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de unidades a retirar"));
                in2.retirarStock(cant);
            } else {
                break;
            }
            in2.mostrarInformacion();
        }

        System.out.println("INVENTARIO");
        in1.mostrarInformacion();
        in2.mostrarInformacion();

        JOptionPane.showMessageDialog(null,in1.getProducto() + ": " + in1.getCantidad() + " unidades       " + in2.getProducto() + ": " + in2.getCantidad() + " unidades ");
    }

}
    

