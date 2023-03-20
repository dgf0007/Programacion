/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer101;

/**
 *
 * @author danie
 */
public class Nota {
    
     String valor;
     int duracion;
    

    
    public Nota(String valor, int duracion) {
        this.valor = valor;
        this.duracion = duracion;
    }
    
    public String toString() {
        String res = "";
        res += "[" +this.valor + "," +this.duracion + "]";
        return res;
    }
}
