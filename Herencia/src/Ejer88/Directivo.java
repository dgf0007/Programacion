/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer88;

/**
 *
 * @author usuario
 */
public class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(nombre);
    }
    
    public String toString() {
        return "Soy " +this.getNombre() + " , directivo de la empresa";
    }
}
