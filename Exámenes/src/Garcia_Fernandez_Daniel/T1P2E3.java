/* Ejercicio  3 (5.5 puntos en total)
Desarrolla un programa que haga lo siguiente:
a) (1 punto) Pide al usuario 6 números enteros mayores a 0 (debes controlar que
eso  suceda correctamente y, en caso de que no suceda así, volver a pedir el
número). Esos números obtenidos deben almacenarse en un array llamado
‘original’. Imprime el contenido del array en horizontal separando cada valor
por un espacio.
Ejemplo: El array 1,2,3,4,5,6 pasa a ser el array 6,1,2,3,4,5*/
 /* Author Daniel */
package Garcia_Fernandez_Daniel;

import java.util.Scanner;

public class T1P2E3 {

    public static void main(String[] args) {

        int n, n2, n3;
        /*números introducidos por el usuaio*/
        int original[] = new int[6];
        /* Primera array creada */
        
          int maximo=0, contador=0; /* Para indentificar el máximo y para contar donde aparece el número */
        Scanner obj = new Scanner(System.in);

        System.out.println("APARTADO A");
        for (int i = 0; i < original.length; i++) {
            do {
                System.out.println("Introduzca un número mayor a 0: ");
                n = obj.nextInt();
                if (n < 0) {
                    System.out.println("Error, Mete un número mayor a 0");
                }
            } while (n <= 0);
            original[i] = n;     
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }
        System.out.println("APARTADO B");

            do {
                System.out.println("Introduzca un número entre 2 y 120");
                n2 = obj.nextInt();
                if (n2 <= 1 || (n2 >= 121)) {
                    System.out.println("Error, Mete un número entre 2 y 120!");
                }
                System.out.println("Introduzca otro número entre 2 y 120");
                n3 = obj.nextInt();
                if (n3 <= 1 || (n3 >= 121)) {
                    System.out.println("Error, Mete un número entre 2 y 120");
                }
            } while (n2 < 2 || (n2 > 120 && (n3 < 2) || (n3 > 120)));
                
            System.out.println("APARTADO C");
            
            int i=0;
            boolean encontrado=false;
            while (i<original.length&&(encontrado==false)) {
            if (original[i]==n2)
                encontrado=false;
        }
            
            if (encontrado==true) {
                System.out.println("El número" +n2+ "esta en el array");
            }
            else {
                System.out.println("No se encuentra en el array");
            }
            
            /* variable boolean = true, poner solo la variable, si es igual a false = !variable */
            if (encontrado&&(!encontrado)) {
                int primera = -1;
                int segunda=-2;
                
                for (int j = 0; j < original.length; j++) {
                    if (original[i]==n2) {
                        if (primera==-1) {
                            primera=j;
                        }
                        else {
                            segunda=j;
                        }        
                    }
                }
                System.out.println("La primera opción aparece en: " +primera);
                System.out.println("La última opción aparece en; " +segunda);
            }
        
        }
    }

