/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Clase_Abstracta;

/**
 *
 * @author usuario
 */
public abstract class Catalan extends Espaniol {
    boolean independentista;

    public Catalan(String nombre, int edad, boolean sexo, boolean fiesta, boolean amorConstitucional) {
        super(nombre, edad, sexo, fiesta);
        this.independentista = !amorConstitucional; // Para negar la opción y que sea lo contrario, en este caso
    }
    @Override
    public void hablar() {
        System.out.println("Bons díes!");
    }
}
