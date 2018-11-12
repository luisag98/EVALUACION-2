/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caballo cHorse = new Caballo();
        cHorse.movimiento();
    }
    
}

class Caballo extends Animal{
    @Override
    public void movimiento(){
        super.movimiento();
        System.out.println("Galopar");
    }
}

abstract class Animal{
    public void movimiento(){
        System.out.println("Algun tipo de movimiento");
    }
}