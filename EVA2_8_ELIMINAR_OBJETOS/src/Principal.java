/*
 * java --> hay que desconectarlos
 * c/c++ --> malloc (agregar memoria)
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
        Test tObj = new Test();
        Test tCopia = tObj;
        tObj.iVal = 100;
        System.out.println(tObj.iVal);
        System.out.println(tObj);
        System.out.println(tCopia);
        tObj = new Test();
        System.out.println("Señor Slim, usted tiene "+tObj.iVal);
        System.out.println(tObj);
        System.out.println(tCopia);        
        tObj = null; // COMO DESHACERSE DE UN OBJETO
        System.out.println(tObj);
        System.out.println(tCopia); 
        System.out.println("Pereme Sr. Slim, tiene "+tCopia.iVal);

    }
    
}

class Test{
    int iVal;
}