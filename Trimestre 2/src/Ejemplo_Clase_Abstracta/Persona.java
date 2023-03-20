/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Clase_Abstracta;

/* @author Daniel */
public abstract  class Persona {
    String nombre;
    int edad;
    boolean sexo;

    public Persona(String nombre, int edad, boolean sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public  void hablar() {
        System.out.println("Eh. . .  Buenos días");
    }
    
}
