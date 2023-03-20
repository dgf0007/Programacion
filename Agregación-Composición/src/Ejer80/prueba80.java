/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer80;

/**
 *
 * @author danie
 */
public class prueba80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        punto punto1 = new punto(12, 12);
        System.out.println(punto1);
        
        circulo circulo1 = new circulo(12, punto1);
        System.out.println(circulo1);
        
        cilindro cilindro1 = new cilindro(circulo1, 12);
        System.out.println(cilindro1);
    }
    
}
