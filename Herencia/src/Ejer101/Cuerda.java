/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer101;

/**
 *
 * @author danie
 */
public class Cuerda extends Instrumento {

    int cuerdas;
    boolean pulsadas;

    public Cuerda(int cuerdas, boolean pulsadas, String marca, int mes, int anio) {
        super(marca, mes, anio);

        this.cuerdas = cuerdas;
        this.pulsadas = pulsadas;

    }
    
    @Override
    public void afinarse() {
        System.out.println("El instrumento de cuerda se está afinando");
    }

}
