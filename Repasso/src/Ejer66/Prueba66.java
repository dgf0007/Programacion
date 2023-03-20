/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer66;

/**
 *
 * @author danie
 */
public class Prueba66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Coche McLaren = new Coche(260, 150, 4);
        McLaren.color = "red";
        
        System.out.println(McLaren);
        
        McLaren.arrancar();
        McLaren.desplazarse();
        System.out.println(McLaren.gasolina);

        McLaren.echarGasolina(50);
        System.out.println(McLaren.gasolina);
        
    }
    
}
