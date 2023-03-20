/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer73;

/**
 *
 * @author danie
 */
public class Pibes {
    String nombre;
    int puntosEsfuerzo = 10;
    int vidasTotales = 7;
    int puntosHambre = 3;
    boolean estado = true; //true es que está vivo 
     
    public Pibes(String nombre) {
        this.nombre = nombre;
        this.puntosEsfuerzo = puntosEsfuerzo;
        this.vidasTotales = vidasTotales;
        this.puntosHambre = puntosHambre;
        this.estado = estado;
    }
    
    public void jugar() {
        
        this.puntosEsfuerzo -=3;
        this.puntosHambre -=1;
        
        if (this.puntosEsfuerzo <=0 || this.puntosHambre <= 0) {
            this.vidasTotales -=1;
            this.puntosEsfuerzo = 10;
            this.puntosHambre = 3;
        }
        
        if (this.vidasTotales <= 0) {
            this.estado = false;
            this.vidasTotales = 0;
            this.puntosEsfuerzo = -1;
            this.puntosHambre = -1;
        }
    }
    
    public void comunicarse() {
        this.puntosEsfuerzo -=1;
    }
    
    public void comer() {
        this.puntosEsfuerzo -=2;
        this.puntosHambre +=2;
        if (this.puntosHambre >3) {
            this.puntosHambre = 3;
        }
    }
    
    public void dormir() {
        this.puntosEsfuerzo += 5;
        if (this.puntosEsfuerzo >10) {
            this.puntosEsfuerzo = 10;
        }
    }
    

    
    @Override
    public String toString() {
        String res = "";
        res += "\n El Pibe se llama " + this.nombre;
        res += "\n El Pibe tiene " + this.puntosEsfuerzo + " puntos de esfuerzo";
        res += "\n El Pibe tiene " + this.puntosHambre + " puntos de hambre";
        res += "\n El Pibe tiene " + this.vidasTotales +" vidas ";
        
        return res;
    }
    
}
