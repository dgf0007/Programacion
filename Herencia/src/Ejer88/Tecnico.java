/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer88;

/**
 *
 * @author usuario
 */
public class Tecnico extends Operario {

    public Tecnico(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public String toString() {
        return "Soy el tecnico " + this.getNombre() + " con el código " + this.getCodigo();

    }
}
