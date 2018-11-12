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
        // CLASE ABSTRACTA: UNA QUE NO SIRVE PARA GENERAR OBJETOS, SOLO SIRVE COMO BASE PARA HERENCIA
        
        //Animal aObj = new Animal();
        Ostra oPalCocktail = new Ostra();
        oPalCocktail.movimiento();
    }
    
}
// FINAL --> YA NO SE PUEDE HEREDAR DE OSTRA
final class Ostra extends Animal{
    
}

abstract class Animal{
    public void movimiento(){
        System.out.println("Movimiento indefinido");
    }
}