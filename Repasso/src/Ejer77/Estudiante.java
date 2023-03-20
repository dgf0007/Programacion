/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer77;

/**
 *
 * @author danie
 */
public class Estudiante {

    private String nombre;
    private String apellidos;
    private int calificaciones[];
    private boolean dentro = false
    

    public Estudiante(String nombre, String apellidos, int numNotas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificaciones = new int[numNotas];
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = -1;
        }

    }

    public void insertarNota(double nota) {
        for (int i = 0; i < calificaciones.length; i++) {
            if (this.calificaciones[i] == -1) {
                this.calificaciones[i] += nota;
            }
        }
    }

}
