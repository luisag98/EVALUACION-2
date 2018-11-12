/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int iBase = input.nextInt();
        System.out.println("Altura");
        int iAltura = input.nextInt();
        Punto pIni = new Punto();
        pIni.setY(0);
        pIni.setX(0);
        rRect.setEsqSupIzq(pIni);
        rRect.setBase(iBase);
        rRect.dibujar();
        System.out.println("Area = "+rRect.calculaArea());
    }    
    
}
