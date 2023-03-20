/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer66;

/**
 *
 * @author danie
 */
public class Coche {

    String color;
    int anchura;
    int altura;
    int puertas;
    int ruedas;
    boolean encendido = false;
    int gasolina = 25;
    boolean tieneGasofa = true;

    public Coche(int anchura, int altura, int puertas) {
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.puertas = puertas;
        this.ruedas = 4;
        this.gasolina = gasolina;
        this.tieneGasofa = tieneGasofa;
    }

    public void arrancar() {

        if (this.tieneGasofa = true) {
            if (this.encendido = true) {
                System.out.println("El coche se ha encendido");
                this.gasolina -= 5;
            } else {
                System.out.println("El coche esta parado");
            }
        }

    }

    public void parar() {
        if (this.encendido = true) {
            System.out.println("El coche se ha parado");
        } else {
            System.out.println("El coche ya estaba parado");
        }
    }

    public void desplazarse() {
        if (this.encendido = true) {
            System.out.println("El coche puede moverse");
            this.gasolina -= 20;
        } else {
            System.out.println("El coche estña parado y no puede moverse");
        }
    }

    public void echarGasolina(int litros) {
        if (this.encendido = false) {
            this.gasolina += litros;
        }
    }

    public void chequear() {
        if (this.gasolina > 0) {
            this.tieneGasofa = true;
        } else {
            this.tieneGasofa = false;
        }
    }
    
    public void pintar(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        String res = "";
        res += "\n El coche es de color " + this.color; 
        res += "\n El coche tiene una altura de " +this.altura;
        res += "\n El coche tiene un ancho de " +this.anchura;
        res += "\n El coche tiene " + this.puertas + " puertas";
        res += "\n El coche tiene 4 ruedas";
        return res;
    }

}
