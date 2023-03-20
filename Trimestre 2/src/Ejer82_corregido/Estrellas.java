/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer82_corregido;

/**
 *
 * @author usuario
 */
public class Estrellas {
    
       private double posicionX;
    private double posicionY;
    private String forma; // Creo la variable forma

    public Estrellas(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;

        // Decidir la forma:
        int alf = (int) (Math.random() * 3 + 1);
        if (alf == 1) {
            this.forma = "*";
        } else {
            this.forma = ".";
        }

    }

    
}
