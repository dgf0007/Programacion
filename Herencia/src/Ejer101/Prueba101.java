/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer101;

/**
 *
 * @author danie
 */
public class Prueba101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cuerda guitarra = new Cuerda(7, true, "aa", 0, 0);
        Viento flauta = new Viento("peruana", "a2", 0, 0);
        Piano pianito = new Piano(8, "Lassiato", 7, 2023, "electrico");
        
        guitarra.afinarse();
        flauta.afinarse();
        pianito.afinarse();

}
     
       

    
    

}
