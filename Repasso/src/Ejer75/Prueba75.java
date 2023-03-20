/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer75;

/**
 *
 * @author danie
 */
public class Prueba75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta santander = new Cuenta("Francisco", 1800);
        Cuenta unicaja = new Cuenta("Pedro");
        santander.ingresar(-5);
        santander.retirar(1900);
        System.out.println(santander);
        System.out.println(unicaja);
        
        Cuenta univia; // Para crear sin inicializar
        univia = new Cuenta(santander); // Copia la información de santander
        System.out.println(univia);
        
        Cuenta c1 = univia; // Si modificas c1, se modifica univia y viceversa
    }
    
}
