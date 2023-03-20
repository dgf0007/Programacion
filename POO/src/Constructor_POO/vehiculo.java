
/* Author Daniel */
package Constructor_POO;

import java.util.Scanner;

public class vehiculo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String color;
        double anchura;
        double altura;
        int puertas;

        System.out.println("Introduzca el color: ");
        color=teclado.nextLine();
        
        System.out.println("Introduzca la anchura: ");
        anchura=teclado.nextDouble();
        
        System.out.println("Introduzca la altura: ");
        altura=teclado.nextDouble();
        
        System.out.println("Introduzxa el número de puertas: ");
        puertas=teclado.nextInt();
        
        coche coche1 = new coche(color, anchura, altura, puertas, true);
            System.out.println("El color del coche es: " +color);
            System.out.println("La anchura del coche es " +anchura+ " y la altura es " +altura);
            System.out.println("El coche tiene " +puertas+ " puertas y 4 ruedas ");

            System.out.println(coche1.gasolina);
            coche1.desplazarse();
            coche1.arrancar();
            System.out.println(coche1.gasolina);
            coche1.desplazarse();
            coche1.desplazarse();
            coche1.echargasolina(20);
            System.out.println(coche1.gasolina);
    }

}
