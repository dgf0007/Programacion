package Practica1;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class T1P1E1 {

    public static void main(String[] args) {

        int num;
        Scanner tlc = new Scanner(System.in);

        System.out.println("Introduzca un número entre 10 y 30: ");
        num = tlc.nextInt();

        int aleatorio = ((int) ((Math.random() * (50 - 1 + 1)) + 1));

        if ((num < 1) || (num > 50)) {
            System.out.println("Error. El número introducido no está en el rango indicado.");

        } else if (aleatorio > num) {
            System.out.println("La máquina ha sacado un " + aleatorio);
            System.out.println("La máquina gana");

        } else if (aleatorio < num) {
            System.out.println("La máquina ha sacado un " + aleatorio);
            System.out.println("La máquina pierde");
        }
        else {
            System.out.println("Es un empate");
        }
    }

}
