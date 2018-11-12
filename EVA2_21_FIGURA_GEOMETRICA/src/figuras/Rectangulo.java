/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author invitado
 */
public class Rectangulo extends FiguraGeometrica {
    private int largo, ancho;

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public void dibujarFig() {
        Punto EsqInfIzq, EsqSupDer, EsqInfDer;
        EsqInfIzq = new Punto();
        EsqSupDer = new Punto();
        EsqInfDer = new Punto();
        
        EsqInfIzq.setX(getEsqSupIzq().getX());
        EsqInfIzq.setY(getEsqSupIzq().getY() - ancho);
        
        EsqInfDer.setX(getEsqSupIzq().getX() + largo);
        EsqInfDer.setY(getEsqSupIzq().getY() - ancho);
        
        EsqSupDer.setX(getEsqSupIzq().getX() + ancho);
        EsqSupDer.setY(getEsqSupIzq().getX());
        
        
        
        System.out.println("("+getEsqSupIzq().getX()+", "+getEsqSupIzq().getY()+")");
        System.out.println("("+EsqInfIzq.getX()+", "+EsqInfIzq.getY()+")");
        System.out.println("("+EsqInfDer.getX()+", "+EsqInfDer.getX()+")");
        System.out.println("("+EsqSupDer.getX()+", "+EsqSupDer.getX()+")");
        
        
    }
    
    
}
