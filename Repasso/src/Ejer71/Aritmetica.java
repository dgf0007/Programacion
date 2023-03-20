/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer71;

/**
 *
 * @author danie
 */
public class Aritmetica {
    int num1;
    int num2;
    int num3;
    
    public Aritmetica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public String getSuma() {
        this.num3 = this.num1 + this.num2;
        return "La suma de los valores es " + this.num3;
    }
    
    public String getResta() {
        this.num3 = this.num1 - this.num2;
        return "La resta de los valores es " +this.num3;
    }
    
    public String getMulti() {
        this.num3 = this.num1 * this.num2;
        return "La multiplicación de los valores es " + this.num3;
    }
    public String getDiv() {
        this.num3 = this.num1 / this.num2;
        return "La división de los valores es " +this.num3;
    }
    public String Getpot() {
        this.num3 = (int) Math.pow(this.num1, this.num2);
        return "La potencia de los valores es " +this.num3;
    }
    
    
}
