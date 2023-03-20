/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer81_2;

/**
 *
 * @author usuario
 */
public class Arma {

    private String nombre;
    private int resistrencia;
    private int poder;
    private int nivel;

    public Arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistrencia = resistencia;
        this.poder = poder;
        this.nivel = 1;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public int getPoder() {
        return this.poder;
    }
    
    public int getResistencia() {
        return this.resistrencia;
    }
    
    public void setResistencia(int resistencia) {
        this.resistrencia = resistencia;
    }
    
    public void subirNivel() {
        this.nivel ++;
        this.resistrencia +=2;
        this.poder ++;
    }

    public String toString() {
        String res = "";
        res += "\n El nombre del arma es " + this.nombre;
        res += "\n La resistencia del arma es " + this.resistrencia;
        res += "\n El poder del arma es " + this.poder;
        return res;
    }
}
