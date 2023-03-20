/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer70;

/**
 *
 * @author danie
 */
public class Rectangulo {
    
    private int base;
    private int altura;
    int area;
    int perimetro;
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.area = this.base * this.altura;
        this.perimetro = 2*(this.base+this.altura);
    }
    
    
    public int calcArea() {
        return this.area;
    }
    
    public int calcPerimetro() {
        return this.perimetro;
    }
    
    @Override
    public String toString() {
        String res = "";
        res += "\n----------------------------------------";
        res += "\nRectángulo con base X y altura Y ";
        res += "\nArea: " + this.area;
        res += "\nPerímetro " + this.perimetro;
        res += "\n----------------------------------------";
        return res;
    }
}
