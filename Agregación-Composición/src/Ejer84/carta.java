/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer84;

/**
 *
 * @author danie
 */
public class carta {
    private int numeros;
    private String palo;
    StringBuilder cadena = new StringBuilder();
    
    public carta(int numeros, String palo){
        this.numeros = numeros;
        this.palo = palo;
        
       
    
    public String toString() {
        return "El número es " +this.numeros + "y la forma es " +this.palo;
    }
}
