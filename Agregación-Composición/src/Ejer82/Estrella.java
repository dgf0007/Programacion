/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer82;

/**
 *
 * @author danie
 */
public class Estrella {
    int posicionX;
    int posicionY;
    String forma;
    
    public Estrella(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        //Hacer la proporción 1 a 3
        int ale = (int) (Math.random() * 3 + 1);
        
        if (ale == 1) {
            this.forma = "*";
        }
        else {
            this.forma = ".";
        }
        
    }
    
    @Override
    public String toString() {
        return this.forma;
    }
}
