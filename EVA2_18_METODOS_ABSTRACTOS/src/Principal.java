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
        cHorse.comer();
        cHorse.respirar();
        
    }
    
}

class Caballo extends Animal{
    @Override
    public void movimiento() {
        System.out.println("Galopando");
    }
    
    @Override
    public void comer(){
        System.out.println("Comer");
    }
    
}

class Avestruz extends Animal{

    @Override
    public void movimiento() {
        System.out.println("Corre a madre");
    }

    @Override
    public void comer() {
        System.out.println("Turistas en el serengueti!!");
    }
    
}

abstract class Animal{
    abstract public void movimiento();
    abstract public void comer();
    public void respirar(){
        System.out.println("El animal esta respirando");
    }

}
