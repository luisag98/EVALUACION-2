import Vehiculo.Vehiculo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisa María González Ordóñez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Vehiculo vCarro = new Vehiculo("FORD", "F-150", 2017, 8);
        vCarro.imprimirDatos();
        vCarro.isEstaEncendido();
        // VERIFICAMOS SI EL AUTO ESTA ENCENDIDO
        if(!vCarro.isEstaEncendido()){ // SI NO ESTA ENCENDIDO
            vCarro.prender(); // LO ARRANCAMOS
        }
        vCarro.acelerar();
        System.out.println("Vas a fabulosos "+vCarro.getVelocidad()+" km/hr");
        
        System.out.println("¿A que velocidad desea llegar?");
        int velocidad = sc.nextInt();
        vCarro.acelerarVelo(velocidad);
        System.out.println("Frenando");
        vCarro.detener(velocidad);
        
    }
    
}