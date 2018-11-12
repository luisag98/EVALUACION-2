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
        //REFERENCIAS: VARIABLE QUE GUARDA UNA DIRECCIÓN EN MEMORIA
        //EN OTROS LENGUAJES SE LE CONOCE COMO APUNTADORES
        Prueba pObj = new Prueba();
        pObj.iValor = 100;
        System.out.println("El valor es "+pObj.iValor);
        //COPIA
        int iAlgo = 70;
        int iCopia = iAlgo;
        System.out.println("iAlgo = "+iAlgo);
        System.out.println("iAlgo = "+iCopia);
        iAlgo = 1000;
        System.out.println("iAlgo = "+iAlgo);
        System.out.println("iAlgo = "+iCopia);
        //COPIA DEL OBJETO
        Prueba pCopiaObj = pObj;
        System.out.println("El valor es "+pObj.iValor);
        System.out.println("El valor es "+pCopiaObj.iValor);
        pObj.iValor = 9999;
        System.out.println("El valor es "+pObj.iValor);
        System.out.println("El valor de la copia es "+pCopiaObj.iValor);

    }
    
}

class Prueba{
    int iValor; //4 BYTES
}