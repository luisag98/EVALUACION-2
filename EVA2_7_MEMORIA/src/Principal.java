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
        System.out.println("Iniciando main");
        A();
        System.out.println("Terminando main");
    }
    public static void A(){
        System.out.println("Iniciando A");
        B();
        System.out.println("Terminando A");
    }
    public static void B(){
        System.out.println("Iniciando B");
        C();
        System.out.println("Terminando B");
    }
    public static void C(){
        System.out.println("Iniciando C");
        System.out.println("Terminando C");
    }
}
