
/* Author Daniel */
package Ejer81;

public class prueba81 {

    public static void main(String[] args) {

        arma tomi = new arma("Raulbuco", 69, 115); // En este caso el arma debe ir encima de Guerrero, para que pueda interpretarlo.
        arma patito = new arma("Beso Negro", 30, 25);

        Guerrero tanque = new Guerrero("Mace Tero", 500, 20, 65, true, tomi);
        Guerrero support = new Guerrero("sandaliasul", 300, 54, 90, true,patito);

        System.out.println(tanque);
        System.out.println(support);
        
    }

}
