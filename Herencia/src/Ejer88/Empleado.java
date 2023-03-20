/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer88;

/**
 *
 * @author usuario
 */
public class Empleado {

    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Soy el empleado " + this.nombre;
    }
}
