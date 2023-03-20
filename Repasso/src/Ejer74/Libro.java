/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer74;

/**
 *
 * @author danie
 */
public class Libro {
    private int iSBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro(String titulo, String autor, int numPaginas, int iSBN) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        
    }

    public int getISBN() { // Getter creado Tiene tipo de retorno de la variable en concreto
        return this.iSBN;
    }
    public void setISBN(int iSBN) { // Setter creado, Tiene que tener un parámetro dentro
        this.iSBN = iSBN;   // El primero hace referencia al atributo de clase y el segundo a un parámetro.
    }
    public String titulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumPaginas() {
        return this.numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
   @Override
    public String toString() {
        String res ="";
        res += "\n El libro " +this.titulo + " con " + this.iSBN + " creado por " +this.autor + " tiene " + this.numPaginas;
        return res;
    }
}

