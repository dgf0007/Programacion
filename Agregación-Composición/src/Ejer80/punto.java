/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer80;

/**
 *
 * @author danie
 */
public class punto {
    private int posicionX;
    private int posicionY;
    
    public punto(int posicionX, int posicionY)  {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    public String toString() {
        String res = "";
        res += "La posición X es " +this.posicionX + " y la posición Y es " +this.posicionY;
        return res;
    }
    
    public void trasladar (int a, int b) {
        this.posicionX += a;
        this.posicionY += b;
    }
}
