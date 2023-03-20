/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Daniel García Fernández
 */
public class Pluma {
    private double ancho;
    private double largo;
    private String color;
    
    //Creo el get de color, para poder utilzarlo en la clase pájaro
    public String getColor() {
        return this.color;
    }
    
    //Creo el get de ancho para poder utilizarlo en la clase pájaro
    public double getAncho() {
        return this.ancho;
    }
    
    //Creo el get de largo, para poder utilizarlo en la clase pájaro
    public double getLargo() {
        return this.largo;
    }
    
    
    
    public Pluma(double ancho, double largo, String color) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
        
        if (this.color.equalsIgnoreCase("verde")) {
            this.color = "verde";
        }
        if (this.color.equalsIgnoreCase("negro")) {
            this.color = "negro";
        }
        if (!this.color.equalsIgnoreCase("verde") || (!this.color.equalsIgnoreCase("negro"))) {
            this.color = "blanco";
        }
    }
    
    public String toString() {
        String res = "";
        res += " Ancho, " +this.ancho + " largo: " +this.largo + " color " + this.color;
        return res;
    }
}
