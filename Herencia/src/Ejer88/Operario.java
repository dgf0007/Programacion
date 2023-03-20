/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer88;

/**
 *
 * @author usuario
 */
public class Operario extends Empleado { //El extend permite la herencia
    private int codigo;
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public Operario(String nombre,int codigo) {
     super(nombre); //El super permite que se herede lo de la clase deseada
        this.codigo = codigo;
        
    }
    
    public void cambiarCodigo(int codigo) {
        this.codigo = codigo;
        
    }
    
    public String toString() {
        return "Soy el operario " + super.getNombre() + " con el código " +this.codigo;
    }
}
