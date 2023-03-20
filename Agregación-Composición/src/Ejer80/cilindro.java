/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer80;

/**
 *
 * @author danie
 */
public class cilindro {
    private int altura;
    private circulo base;
    
    public cilindro(circulo base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int volumenCilindro() {
        return (int) (Math.PI * Math.pow(base.getRadio(), 2) * altura);
    }
    
    @Override
    public String toString() {
        String res = "";
        res += "La base del cilindro es " +this.base + " y su altura es " + this.altura;
        return res;
    }
}
