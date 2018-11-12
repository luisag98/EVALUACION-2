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
        Animal aAni = new Animal();
        aAni.movimiento();
        Caballo cHorse = new Caballo();
        //cHorse.movimiento("Galopar");
        Ostra aOstra = new Ostra();
        aOstra.movimiento();
    }
    
}

class Caballo extends Animal{
    @Override
    public void movimiento(){
        System.out.println("Galopar");
    }
    public void movimiento(String sMovi){
        System.out.println(sMovi);
    }
}

class Ostra extends Animal{
    
}

class Animal{
    public void movimiento(){
        System.out.println("Movimiento indefinido");
    }
}