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
        System.out.println("Area de un cuadrado de lado 100 = "+Geometria.areaCuadrado(100));
        System.out.println("Area de un triágulo de base 10 y altura 8 = "+Geometria.areaTriangulo(10, 8));
        System.out.println("Area de un rectángulo de base 7 y altura 8 = "+Geometria.areaRectangulo(7, 8));
        System.out.println("Area de un rombo de diagonales 8 y 9 = "+Geometria.areaRombo(8, 9));
        System.out.println("Area de un romboide de base 18 y altura 4 = "+Geometria.areaRomboide(18, 4));
    }
    
}

class Geometria{
    public static double areaCuadrado(double dLado){
        return dLado*dLado;
    }
    public static double areaTriangulo(double dBase, double dAltura){
        return ((dBase*dAltura)/2);
    }
    public static double areaRectangulo(double dBase, double dAltura){
        return dBase*dAltura;
    }
    public static double areaRombo(double dDiagon1, double dDiagon2){
        return  ((dDiagon1*dDiagon2)/2);
    }
    public static double areaRomboide(double dBase, double dAltura){
        return dBase*dAltura;
    }
    public static double areaTrapecio(double dBase1, double dBase2, double dAltura){
        return (((dBase1+dBase2)*dAltura)/2);
    }
    public static double areaCirculo(double dRadio){
        return Math.PI*dRadio;
    }
    public static double areaPentagono(double dLado, double dApotema){
        double perimetro=dLado*5;
        return (perimetro*dApotema)/2;
    }
    public static double areaHexagono(double dLado, double dApotema){
        double perimetro=dLado*6;
        return (perimetro*dApotema)/2;
    }
    public static double areaDecagono(double dLado, double dApotema){
        double perimetro=dLado*10;
        return (perimetro*dApotema)/2;
    }
}