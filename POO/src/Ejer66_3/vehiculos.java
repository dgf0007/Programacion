package Ejer66_3;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class vehiculos {

    public static void main(String[] args) {

        String color;
        double anchura;
        double altura;
        int puertas;
        boolean ruedas = true;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el color del coche: ");
        color = teclado.nextLine();

        System.out.print("Introduzca la anchura del coche: ");
        anchura = teclado.nextInt();

        System.out.print("Introduzca la altura del coche: ");
        altura = teclado.nextInt();

        System.out.print("Introduzca el número de puertas: ");
        puertas = teclado.nextInt();

        coche coche1 = new coche(color, anchura, altura, puertas, true);

        System.out.println("El coche ha empezado con " + coche1.gasolina + " litros de gasolina");
        coche1.arrancar();
        coche1.desplazarse();
        System.out.println(coche1.chequear);
        System.out.println("Ahora tiene " + coche1.gasolina);
        coche1.echargasolina(25);
        System.out.println("Llenamos el depósito de nuevo " + coche1.gasolina + " litros");
        System.out.println(coche1.chequear);

    }

}
