/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer80;

/**
 *
 * @author danie
 */
public class circulo {
    private int radio;
    private punto centro;
    
    public int getRadio() {
        return this.radio;
    }
    
    public circulo(int radio, punto centro) {
        this.radio = radio;
        this.centro = centro;
    }
    
    public int areaCirculo() {
      return (int) (Math.PI * Math.pow(radio, 2));
    }
    
    public int perimetroCirculo() {
        return (int) (2 * Math.PI * radio);
    }

    
    public String toString() {
        String res = "";
        res += "El centro del círculo es " +this.centro + " y el radio es " +this.radio;
        return res;
    }
    
       public void trasladar(int a, int b) {
        centro.trasladar(a, b);
    }
}
 