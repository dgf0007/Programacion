/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer72;

/**
 *
 * @author danie
 */
public class Persona {
    String nombre;
    int edad;
    String sexo;
    String pais;
    boolean mayorEdad = false;
    
    public Persona(String nombre, int edad, String sexo, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
        this.mayorEdad = mayorEdad;
    }
    
    public String getSaludar(int num) {
        
       /* switch (num) {
            case 1:
                return "Hola!, me llamo " +this.nombre + " y soy del pais " +this.pais;
            case 2:
                return "Buenas tardes mi jai";
            case 3:
                return "Que dise el titi";
            default:
                throw new AssertionError();
        }*/
       
        switch (num) {
            case 1:
                System.out.println("Hola!, me llamo " +this.nombre + " y soy del pais " +this.pais);
                break;
            case 2:
                System.out.println("Que dise el titi");
                break;
            case 3:
                System.out.println("Me compré un panamera");
                break;
            default:
                throw new AssertionError();
        }
        return null;
    }
    
    public void mostrarDatos() {
        System.out.println(toString()); 
    }
    
    public boolean esMayorEdad() {
        if (this.edad >=18) {
            return this.mayorEdad = true;
        }
        else {
            return this.mayorEdad = false;
        }
    }
    
    public String toString() {
        String res = "";
        res += "\nLa persona se llama " +this.nombre;
        res += "\nLa persona tiene " +this.edad + " años";
        res += "\n La persona Tiene un sexo de " + this.sexo;
        res += "\n La persona es del pais " + this.pais;
        if (this.edad >=18) {
            res +=("\nEs mayor de edad");
        }
        else {
            res+= ("\nNo es nayor de edad");
        }
        
        return res;
    }
}
