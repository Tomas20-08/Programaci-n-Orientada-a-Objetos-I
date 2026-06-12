
package Encapsulamiento;

import javax.swing.JOptionPane;

public class Ejercicio03_CuentaBancaria {
    
    static class CuentaBancaria {
  
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de " + monto + " realizado. Saldo actual: " + saldo);
            JOptionPane.showMessageDialog(null, "Depósito de " + monto + " realizado | Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor a cero Error");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor a cero Error");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo disponible: " + saldo);
            JOptionPane.showMessageDialog(null, "Fondos insuficientes | Saldo disponible: Error");
        } else {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado. Saldo actual: " + saldo);
            JOptionPane.showMessageDialog(null, "Retiro de " + monto + " realizado | Saldo actual: " + saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

public static void main(String[] args) {

        // Crear cuenta
        String titular = JOptionPane.showInputDialog(null, "Ingrese el nombre del titular:");
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el saldo inicial:"));

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);
        System.out.println("Cuenta creada para: " + titular + "Saldo inicial: " + saldoInicial);

        // Depositar
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar:"));
        cuenta.depositar(deposito);

        // Retirar
        double retiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar:"));
        cuenta.retirar(retiro);

        // Saldo final
        String resumen = "Titular: " + cuenta.getTitular() + " Saldo final: " + cuenta.getSaldo();
        System.out.println(resumen);
        JOptionPane.showMessageDialog(null, "Resumen de cuenta: " + resumen + " Saldo Final");
    }
}  
    