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
    }
    
}

class Caballo implements ComportamientoAnimal{

    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }

    @Override
    public void comer() {
        System.out.println("Comer");    }
    
}

interface ComportamientoAnimal{
    public void movimiento();
    public void comer();
}