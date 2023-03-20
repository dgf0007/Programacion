/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer67;

/**
 *
 * @author danie
 */
public class Punto {
    int magnitudX;
    int magnitudY;
    
    public Punto() {
        this.magnitudX = magnitudX;
        this.magnitudY = magnitudY;
    }
    
    public void moverHorizontal(int numX) {
        magnitudX += numX;
        
    }
    
    public void moverVertical(int numY) {
        magnitudY += numY;
    }
    
    public void mostrar() {
        System.out.println("Punto X " + magnitudX + " Punto Y " + magnitudY);
    }
}
