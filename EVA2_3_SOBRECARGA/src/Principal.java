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
        Operaciones oObj = new Operaciones();
        System.out.println("La suma de 5 + 7 = "+oObj.suma(5, 7));
        System.out.println("La suma de Juan y Perez es "+oObj.suma("Juan ", "Perez"));
        System.out.println("true AND false es "+oObj.suma(true, false));
        
    }
    
}

class Operaciones{
    public int suma(int iVal1, int iVal2){
        return iVal1 + iVal2;
    }
    public String suma(String sVal1, String sVal2){
        return sVal1 + sVal2; //CONCATENANDO
    }
    public boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2; // AND
    }
}
