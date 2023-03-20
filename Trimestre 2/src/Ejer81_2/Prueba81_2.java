
/* Author Daniel */
package Ejer81_2;

public class Prueba81_2 {

    public static void main(String[] args) {
        Arma arma1 = new Arma("Alius", 45, 72);
        Arma arma2 = new Arma("Arcane", 38, 58);
        
        Guerrero tanque = new Guerrero("tanque", 60, 150, arma1);
        Guerrero support = new Guerrero("Support", 25, 80, arma2);
        
    }

}
