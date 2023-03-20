/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer73;

/* @author Daniel*/
public class pibes {

    String nombre;
    int puntosEsfuerzo;
    int vidasTotales;
    int puntosHambre;
    Boolean vivo;
    
    public pibes( String nombresito) {
        this.nombre = nombresito;
        this.vidasTotales = 7;
        this.puntosHambre = 3;
        this.puntosEsfuerzo = 10;
        this.vivo = true;
    }

    public void jugar() {
        if (this.vivo == true) {
            this.puntosEsfuerzo -= 3;
            this.puntosHambre -= 1;
            muerte();  /* Para poner uno método dentro de otro */
            esfuerzo(); /* Para poner el método esduerzo dentro de jugar */
        }
    }

    public void comunicarse() {
        if (this.vivo == true) {
            this.puntosEsfuerzo -= 1;
            muerte();  /* Para poner uno método dentro de otro */
            esfuerzo(); /* Para poner el método esduerzo dentro de jugar */
        }
    }

    public void comer(String comida) {
        if (this.vivo == true) {
            this.puntosEsfuerzo -= 2;
            if (comida.equalsIgnoreCase("favorita")) {
                this.puntosHambre += 3;
            } else {
                this.puntosHambre += 2;
            }
            muerte();  /* Para poner uno método dentro de otro */
            esfuerzo(); /* Para poner el método esduerzo dentro de jugar */
        }
        if (this.puntosHambre > 3) {
            this.puntosHambre = 3;
        }
    }

    public void dormir() {
        if (this.vivo == true) {
            this.puntosEsfuerzo += 5;
            if (this.puntosEsfuerzo > 10) {
                this.puntosEsfuerzo = 10;
            }
        }
    }

    public void esfuerzo() {
        if (this.puntosEsfuerzo <= 0 || puntosHambre <= 0) {
            this.vidasTotales -= 1;
            if (this.vidasTotales < 0) {
                this.vidasTotales = 0;
            }
            this.puntosHambre = 3;
            this.puntosEsfuerzo = 10;
        }
    }

    public void muerte() {
        if (this.vidasTotales <= 0) {
            this.puntosEsfuerzo = -1;
            this.puntosHambre = 1;
            this.vivo = false;

        }
    }
}
