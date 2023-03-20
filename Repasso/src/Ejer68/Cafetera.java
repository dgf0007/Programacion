/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer68;

/**
 *
 * @author danie
 */
public class Cafetera {
    
    int capacidadMaxima;
    int cantidadActual;
    
    
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    
    public void echarCafe(int cc) {
        this.cantidadActual += cc;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = 1000;
        }
    }
    
    public void llenarCafetera() {
        this.cantidadActual = 1000;
    }
    
    public void vaciarCafetera() {
        this.cantidadActual -= this.capacidadMaxima;
    }
    
    public void servirTaza(int cc) {
        if (this.cantidadActual > cc ) {
            this.cantidadActual -=cc;
        }
        else {
            System.out.println("No hay suficiente café en la cafetera");
        }
    }
    
    public void cantidadCafe() {
        System.out.println(this.cantidadActual);
    }
}
