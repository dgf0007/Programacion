package Ejer66_2;

import java.util.Scanner;

/* @author daniel*/
public class vehiculos {

    public static void main(String[] args) {

        String color;
        double anchura;
        double altura;
        int puertas;
        boolean ruedas = true;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el color: " );
        color = teclado.nextLine();

        System.out.print("Introduzca la anchura: " );
        anchura = teclado.nextDouble();

        System.out.print("Introduza la altura: " );
        altura = teclado.nextDouble();

        System.out.print("Introduzca el número de puertas: " );
        puertas = teclado.nextInt();

        coche coche1 = new coche(color, anchura, altura, puertas, true);

        System.out.println(coche1.gasolina);
        coche1.desplazarse();
        coche1.arrancar();
        coche1.echargasolina(20);
        System.out.println(coche1.gasolina);
        coche1.desplazarse();
        coche1.desplazarse();
        coche1.desplazarse();
        System.out.println(coche1.gasolina);

    }

}
