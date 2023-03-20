/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author usuario
 */
public class Pajaro {

    private String tipo;
    private int edad;
    private Pluma plumas[];

    public Pajaro(String tipo, int edad) {
        this.tipo = tipo;
        this.edad = edad;
        this.plumas = new Pluma[(int) ((Math.random() * 85 - 5) + 5)]; //Math.random para generar de forma aleatoria las plumas que tendrá el pájaro.

        //Realizo un array de Strings
        String[] valores = {"Blanco", "Negro", "Verde"}; // Para generar el color aleatoriamente
        for (int i = 0; i < plumas.length; i++) {
            String randomValor = valores[(int) (Math.random() * 3)]; //Para generar aleatorios entre las notas
            valores[i] = randomValor;
        }

    }

    public String toString() {
        String res = "";
        res += "\nEl pájaro " + this.tipo + " de" + this.edad + "  años";
        res += "\nPlumaje: ";
        return res;
    }
}
