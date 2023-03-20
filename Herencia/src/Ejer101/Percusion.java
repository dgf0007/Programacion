/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer101;

/**
 *
 * @author danie
 */
public abstract  class Percusion extends Instrumento {

    boolean baquetas;

    public Percusion(boolean baquetas, String marca, int mes, int anio) {
        super(marca, mes, anio);

        this.baquetas = baquetas;

        if (this.baquetas = baquetas) {
            this.baquetas = true;
        } else {
            this.baquetas = false;
        }
    }
}
