/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer81;

/**
 *
 * @author danie
 */
public class prueba81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        arma arma1 = new arma("Escalibur", 20, 43);
        arma arma2 = new arma("Gaia", 41, 17);
        
        Guerrero tanque = new Guerrero("Tanque", 45, 100,arma1);
        Guerrero suppor = new Guerrero("Support", 74, 20,arma2);

        System.out.println(tanque);
        System.out.println(suppor);
        tanque.atacar(suppor);
        System.out.println(tanque);
        System.out.println(suppor);

    }

}
