/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer73;

/**
 *
 * @author Yolanda
 */
public class criaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        pibes pibes1 = new pibes("pedro");

        pibes1.jugar();
        pibes1.jugar();
        pibes1.comer("dioles");
        pibes1.comunicarse();
        pibes1.dormir();
        pibes1.dormir();
        pibes1.jugar();
        pibes1.jugar();

        pibes1.jugar();

        System.out.println("Puntos esfuerzo " + pibes1.puntosEsfuerzo);
        System.out.println("Puntos Hambre " + pibes1.puntosHambre);
        System.out.println("Vidas totales " + pibes1.vidasTotales);

    }

}
