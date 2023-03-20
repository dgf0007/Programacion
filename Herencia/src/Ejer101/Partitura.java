/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer101;

/**
 *
 * @author danie
 */
/* public class Partitura {
    private String nombre;
    private String autor;
    private nota notas[]; //Creo el array de objetos (notas)
    private static int longitud; //Solo la clase lo usa
    
    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.notas = new nota[100]; //Inicializo el array de objetos
        this.longitud = notas.length; 
            
        for (int i = 1; i <= longitud; i++) {
            notas[i] = null;
        }

    }
    
    public int numNotas() {
        return this.longitud;
    }
    
    public boolean addnota(nota nueva) {
        for (int i = 1; i <= longitud; i++) {
            if (notas[i]==null) {
                notas[i] = nueva;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String res = "";
        res += "autor " +this.autor + "nombre " +this.nombre;
        res += "\n";
        
        int contadorNotas = 0;
        
        for (int i = 1; i <= longitud; i++) {
            contadorNotas++;
            if (contadorNotas % 10 ==0) {
                return "\n";
            }
            else {
                return " ";
            }
        }
        return res;
    }
    

}*/

public class Partitura {
    private String nombre;
    private String autor;
    private Nota[] notas;
    private int numNotas = 0;

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        this.notas = new Nota[100];
    }

    public int numNotas() {
        return numNotas;
    }

    public boolean addNota(Nota nueva) {
        if (numNotas >= 100) {
            return false;
        }
        notas[numNotas] = nueva;
        numNotas++;
        return true;
    }

    public String toString() {
        String result = nombre + " de " + autor + "\n";
        for (int i = 0; i < numNotas; i++) {
            result += notas[i];
            if ((i + 1) % 10 == 0) {
                result += "\n";
            }
        }
        return result;
    }
    
}
