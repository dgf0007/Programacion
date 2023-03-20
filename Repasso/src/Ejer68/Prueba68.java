/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer68;

/**
 *
 * @author danie
 */
public class Prueba68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cafetera LosPatio = new Cafetera();
        
        LosPatio.echarCafe(850);
        LosPatio.cantidadCafe();
        LosPatio.llenarCafetera();
        LosPatio.cantidadCafe();
        LosPatio.vaciarCafetera();
        LosPatio.cantidadCafe();
        LosPatio.echarCafe(850);
        LosPatio.servirTaza(250);
        LosPatio.cantidadCafe();
    }
    
}
