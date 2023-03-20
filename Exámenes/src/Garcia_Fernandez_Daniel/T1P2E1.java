/* Ejercicio 1 (1.5 puntos)
Pide por teclado un numero entero positivo o negativo pero distinto de cero (debes
controlar que eso  suceda correctamente y, en caso de que no suceda así, volver a
pedir el número). Si llamamos X al numero entero que se pide por teclado, calcula la
siguiente suma:*/

 /* Author Daniel */
package Garcia_Fernandez_Daniel;

import java.util.Scanner;

public class T1P2E1 {

    public static void main(String[] args) {

        int x;
        Scanner obj = new Scanner(System.in);

        /*  do {
            System.out.println("Introduzca un número positivo o negativo");
            x = obj.nextInt();
        } while (x == 0);

        /* En mi caso he puesto la fórmula  completa en el SOUT
        
        System.out.println("La suma de polinomios es: " +(+x + (Math.pow(x, 2)) / 2) + (Math.pow(x, 3) / 3) + (Ma/th.pow(x, 4) / 4) + (Math.pow(x, 5) / 5) + (Math.pow(x, 6) / 6) + (Math.pow(x, 7) / 7) + (Math.pow(x, 8) / 8) + (Math.pow(x, 9) / 9)); */
        
        
        do {
            System.out.println("Introduzca un número que no sea 0");
            x = obj.nextInt();

            if (x == 0) {
                System.out.println("Número que no sea 0 porfavor ");
            }
        } while (x == 0);
        
        double  suma = x;

        for (int i = 1; i < 9; i++) { /* x elevado a 1 / 1 = X */
            suma += Math.pow(x, i) / i;
        }
        System.out.println(suma);

        obj.close();
    }

}
