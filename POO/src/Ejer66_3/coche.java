/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer66_3;

/**
 *
 * @author danie
 */
public class coche {

    String color;
    double anchura;
    double altura;
    int puertas;
    boolean ruedas = true;
    boolean arrancar = true;
    int gasolina = 25;
    boolean chequear=false;

    public coche(String color, double anchura, double altura, int puertas, boolean ruedas) {
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.arrancar = arrancar;
        this.gasolina = gasolina;
        this.chequear=chequear;
    }

    public void arrancar() {
        if (this.arrancar == true) {
            if (this.gasolina >= 5) {
                System.out.println("El coche se ha arrancado");
                this.gasolina -= 5;
            }
        } else {
            System.out.println("El coche no se ha arrancado o ya lo estaba");
        }
    }

    public void parar() {
        if (this.arrancar == true) {
            System.out.println("El coche se ha parado");
        } else {
            System.out.println("El coche no se ha parado ya que no estaba arrancado");
        }
    }

    public void desplazarse() {
        if (this.arrancar == true) {
            if (this.gasolina >= 20) {
                System.out.println("El coche puede desplazarse");
                this.gasolina-=20;
            }
        } else {
            System.out.println("El coche no se ha arrancado, por ende no puede desplazarse");
        }
    }
    
    public void echargasolina(int litros){
        if (arrancar==true){
            this.gasolina+=litros;
            if (this.gasolina>=50) {
                this.gasolina=50;
            }
            if (this.gasolina>0) {
                chequear=true;
            }
            else {
                chequear=false;
            }
        }
    }
    
    
    public String toString(){
        String res="";
        res+="Lo que sea\n";
        res+="Lo que sea tmb\n";
        res+="De locos\n";
        return  res;
    }

}
