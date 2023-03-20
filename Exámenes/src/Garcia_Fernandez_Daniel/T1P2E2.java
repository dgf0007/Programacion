/* Crea un programa que implemente el siguiente juego entre la maquina y un usuario:
•Se coloca un marcador con victorias de la maquina y victorias del jugador.
Ambos valores empezarán en 0 al comenzar el juego..
•Se le pide al usuario que introduzca o el 0 o un numero entero entre 5 y 15.
Nota: Hay que controlar que esto ocurra correctamente. Si no es así se vuelve a pedir.
•Si el jugador introduce 0, el programa se acaba. Sino, el juego sigue.
•A continuación, la maquina saca un numero aleatorio entre 1 y 20;
•Se comprueba cual de los dos valores es el mayor (el de la máquina o el del
jugador) y se decide si gana la maquina o el jugador. 
•Se le suma uno al marcador de victorias del que haya ganado. En caso de
empate, no se suma nada.
•El juego se repite hasta que el jugador ponga un 0 como número jugado.*/
 /* Author Daniel */
package Garcia_Fernandez_Daniel;

import java.util.Scanner;

public class T1P2E2 {

    public static void main(String[] args) {

        int nuser;
        /*Almacena el número que introducirá el usuario */
        int marcauser = 0;
        /*Contara las victorias del usuario */
        int marcama = 0;
        /* Contará las victorias de la máquina */
        Scanner obj = new Scanner(System.in);

        System.out.println("Victorias Máquina: " + marcama);
        System.out.println("Victorias Jugador: " + marcauser);

        do {
            System.out.println("Introduzca un número entre 5 y 15 (0 para salir)");
            nuser = obj.nextInt();

            if (nuser >= 5 && (nuser <= 15)) {
                int r = (int) ((Math.random() * (20 - 1 + 1)) + 1);
                System.out.println("La máquina ha sacado: " + r);
                if (nuser < r) {
                    System.out.println("Has perdido");
                    marcama++;
                } else if (nuser > r) {
                    System.out.println("Tu ganas!");
                    marcauser++;
                } else if (nuser == r) {
                    System.out.println("Es un empate");
                }
                System.out.println("Victorias Máquina: " + marcama);
                System.out.println("Victorias Jugador: " + marcauser);
            }
            if (nuser == 0) {
                System.out.println("Game over");
            }
        } while ((nuser != 0));
obj.close();
    }
}
