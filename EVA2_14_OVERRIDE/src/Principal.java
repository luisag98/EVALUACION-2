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
        Animal aAni = new Animal("pararse");
        Mamifero mMam = new Mamifero();
        Mamifero mJirafa = new Mamifero("pararse");
        
    }
    
}

class Mamifero extends Animal{
    public Mamifero(){
        //LO PRIMERO ES LLAMAR AL CONSTRUCTOR DE LA CLASE BASE
        super();
    }
    public Mamifero(String accion){
        super(accion);
        System.out.println("Y salir corriendo");
    }
}

class Animal{
    public Animal(){
        System.out.println("Respirando");
    }
    public Animal(String accion){
        System.out.println("Respirar y "+ accion);
    }
}
