/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer101;

/**
 *
 * @author danie
 */
public class Piano extends Instrumento {

    private int teclas;
    private String tipo;

    public Piano(int cuerdas, String marca, int mes, int anio, String tipo) {
        super(marca, anio, anio);
        this.teclas = (int) (int)(Math.random()*(88-49+1)+49); //Formula perfecta para calcular numeros aleatorios ((max-min+1)+min)
        this.tipo = tipo;

       
    }
    
    @Override
    public void afinarse() {
        System.out.println("Se han tensado correctamente las " + this.teclas + " del piano");
    }

}
