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
    int iValor;
    public Principal(){
        iValor=10;
    }
    /**
     * @param args the command line arguments
     */
    static String sMensaje = "Hola";
    public static void main(String[] args) {
        // TODO code application logic here
        Principal pObj = new Principal();
        pObj.imprimir();
        pObj.imprimir2(10000);
        String sMensaje = "Nada de hola";
        System.out.println(sMensaje);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public void imprimir(){
        System.out.println("Valor = "+iValor);
    }
    public void imprimir2(int iValor){
        System.out.println("Valor = "+iValor);
        System.out.println("Valor del atributo = "+this.iValor);
    }
    
}
