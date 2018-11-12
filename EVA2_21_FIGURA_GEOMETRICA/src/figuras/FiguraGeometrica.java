/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author temporal2
 */
public abstract class FiguraGeometrica {
    //ATRIBUTOS
    private Punto pEsqSupIzq;
    private String color;
    private int anchoLinea;

    public Punto getEsqSupIzq() {
        return pEsqSupIzq;
    }

    public void setEsqSupIzq(Punto pEsqSupIzq) {
        this.pEsqSupIzq = pEsqSupIzq;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnchoLinea() {
        return anchoLinea;
    }

    public void setAnchoLinea(int anchoLinea) {
        this.anchoLinea = anchoLinea;
    }

   
    
    public abstract double calcularArea();
    public abstract void dibujarFig();
}
