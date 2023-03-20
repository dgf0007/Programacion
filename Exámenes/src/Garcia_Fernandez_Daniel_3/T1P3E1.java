
/* Author Daniel */
package Garcia_Fernandez_Daniel_3;

import java.util.Scanner;

public class T1P3E1 {

    public static void main(String[] args) {

        int n = 0;/* Defino la variable n para el apartado a*/
        int fila=0; /* Defilo la variable filas para introducir en el apartado F*/
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduzca un número mayor a uno");
            n = teclado.nextInt();
            if (n<=1) {
                System.out.println("Error, El número debe ser mayor a 1");
            }
        } while (n <= 1);

        int matriz[][] = new int[n][n]; /*Defino la primera matriz */
        int sumatorio=0; /* deifno la variable para calcular la suma */
        int copia[][]= new int[n][n]; /* Defino la segunda matriz */
        int num=0; /* Defino la variable num, para el apartado f */
        
        /* Crear matriz con mismos valores  int copia[][]=matriz.lenght / int [n][n]; */

        System.out.println("Apartado C");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int r = (int) (Math.random() * 20 - 1) + 2;
                matriz[i][j]=r;   
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumatorio+=matriz[i][j];
                
            }
        }
        System.out.println("Apartado D");
        System.out.println("La suma total de los elementos de la matriz es : " +sumatorio);

        System.out.println("Apartado E");
        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                 copia[i][j]=matriz[i][j];
                if (copia[i][j]>10) {
                    copia[i][j]=9;
                    /*System.out.print(copia[i][j]+" "); no se pone */
                }
                else {
                    /* copia[i][j]=matriz[i][j];*/
                }
            }
            System.out.println(" ");
        }    
        System.out.println("Apartado F");
        
/* Apartado f necesita crear un auxiliar.
        Son necesarias 3 líneas 
        
        for (int i=0; i< matriz.length;i++){.
                aux=matriz[num][i];
                matriz[num][i]=copia;[num][i];
                copia[num][i]=aux;
                  ##sout (matriz[num][i]);## es para sacarlo por pantalla
        
        */
        
        do {
            System.out.println("Introduzca un número entre uno y el número introducido anteriormente");
            num=teclado.nextInt();
            if (num>=n||num<=1) {
                System.out.println("Error, introduzca un número válido");
            }
        } while (num<n||num>1);
        num=num-1; 
        
        System.out.println("Dime que fila debo intercambiar (1 a 3: " );
        fila=teclado.nextInt();
        
    teclado.close();
    } 

}
