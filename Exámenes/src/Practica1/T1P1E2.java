package Practica1;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class T1P1E2 {

    public static void main(String[] args) {

        int num1, num2, num3, media;
        Scanner tlc = new Scanner(System.in);

        System.out.println("Introduce primera nota: ");
        num1 = tlc.nextInt();

        System.out.println("Introduce la segunda nota: ");
        num2 = tlc.nextInt();

        System.out.println("Introduce la tercera nota: ");
        num3 = tlc.nextInt();

        media = ((num1 + num2 + num3) / 3);

        if (num1 < 0 || (num3 > 10)) {
            System.out.println("La primera nota " + num1 + " no es correcta");
            

        } if (num2 < 0 || (num3 > 10)) {
            System.out.println("La segunda nota " + num2 + " no es correcta");
            

        } if (num3 < 0 || (num3 > 10)) {
            System.out.println("La tercera nota " + num3 + " no es correcta");
            

        }

        if ((media >= 0) && (media <= 4)) {
            System.out.println("La media es INSUFICIENTE");
        } else if ((media >= 5) && (media <= 6)) {
            System.out.println("La media es SUFICIENTE");
        } else if ((media >= 7) && (media <= 8)) {
            System.out.println("La media es NOTABLE");
        } else if ((media >= 9) && (media <= 10)) {
            System.out.println("La media es SOBRESALIENTE");
        }
    }

}
