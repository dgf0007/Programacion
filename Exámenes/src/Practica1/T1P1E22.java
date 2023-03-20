package Practica1;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class T1P1E22 {

    public static void main(String[] args) {
        boolean error=false;

        Scanner tlc = new Scanner(System.in);

        System.out.println("Introduzca la primera nota");
        int nota1 = tlc.nextInt();

        System.out.println("Introduzca la segunda nota");
        int nota2 = tlc.nextInt();

        System.out.println("Introduzca la tercera nota");
        int nota3 = tlc.nextInt();

       /*  if ((nota1 < 0) || (nota1 > 10) || (nota2 < 0) || (nota2 > 10) || (nota3 < 0) || (nota3 > 10)) { Es una opción similar a la del boolean */

            if ((nota1 < 0) || (nota1 > 10)) {
                System.out.println("La primera nota " + nota1+ "no es correcta");
                error=true;
            }
            if ((nota2 < 0) || (nota2 > 10)) {
                System.out.println("La segunda nota " + nota2+ "no es correcta");
                error=true;
            }
            if ((nota3 < 0) || (nota3 > 10)) {
                System.out.println("La tercera nota " + nota3+ "no es correcta");
                error=true; 
            }
            
            if (error==false) {
                int  media = ((nota1 + nota2 + nota3) / 3);
                 System.out.println("La media es " +media);
        }
            
    }

}
