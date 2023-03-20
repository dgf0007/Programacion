package Practica1;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class T1P1E3 {

    public static void main(String[] args) {

        int salario, hora=0, extra=0;
        Scanner tlc = new Scanner(System.in);

        System.out.println("Introduzca el número de horas trabajadas durante la semana");
        hora = tlc.nextInt();

        if (hora <= 40) {
            salario = (12 * hora);
            System.out.println("El sueldo semanal es de: " + salario + " euros");
            
        } else if (hora >= 41) {
            salario=(12*hora);
            extra=((hora-40)*16)+(40*12);
            
            
                System.out.println("El sueldo semanal es de " + extra + " euros");
        }

    }

}
