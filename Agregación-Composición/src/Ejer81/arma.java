/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer81;

/**
 *
 * @author danie
 */
public class arma {
    private String nombre;
    private int resistencia;
    private  int poder;
    private int nivel;
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getPoder() {
        return this.poder;
    }
    
    public int getResistencia() {
        return this.resistencia;
    }
    
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    public int getNivel() {
        return this.nivel;
    }
    
    public arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
        this.nivel = 1;
    }
    
    public void subirNivel() {
        this.nivel ++;
        this.resistencia +=2;
        this.poder ++;
    }
    
    
    public String toString() {
        String res = "";
        res += "\nEl nombre del arma es " +this.nombre;
        res += "\nLa resistencia del aram es " +this.resistencia;
        res += "\nEl poder del arma es" + this.poder;
        return res;
    }
}
