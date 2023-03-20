/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer101;

/**
 *
 * @author danie
 */
public class Viento extends Instrumento { //En este caso la clase principal es la que tiene el abstract y el resto de clases es la que la sobreescribe
    String tipo;
    
    
    public Viento(String tipo, String marca, int mes, int anio) {
        super(marca, mes, anio);
        this.tipo = tipo;
        
        if (this.tipo.equalsIgnoreCase("metal")) {
            this.tipo = "metal";
        }
        else {
            this.tipo = "madera";
        }
    }
    
    @Override
    public void afinarse() {
        System.out.println("El instrumento de viento se está afinando");
    }
}
