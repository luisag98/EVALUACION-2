/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco bMiCuenta = new Banco();
        System.out.println("Nombre del cliente: "+bMiCuenta.getNombreCliente());
        System.out.println("Saldo del cliente: "+bMiCuenta.getSaldo());
        
        Banco bMiCuenta2 = new Banco("Juan Perez Jolote", 5000);
        
        System.out.println("Nombre del cliente: "+bMiCuenta2.getNombreCliente());
        System.out.println("Saldo del cliente: "+bMiCuenta2.getSaldo());
    }
    
}

class Banco{
    private String nombreCliente;
    private double saldo;

    public Banco() {
        nombreCliente = "Luisa María González Ordóñez";
        saldo = 100000;
    }

    public Banco(String nombreCliente, double saldo) {
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    
    

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
