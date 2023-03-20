/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer69;

/**
 *
 * @author danie
 */
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;
   
    // Constructor con todos los atributos
    public Hora (int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        arreglarHoras();
    }

    // Método para saber hora y minutos //Setter para los amigos
    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = 0;
        arreglarHoras();
    }
    
    // Constructor para saber horas 
    
    public Hora(int horas) {
        this.horas = horas;
        this.minutos = 0;
        this.segundos =0;
    }
    
    private void arreglarHoras() {
        /* Siempre que hay una conversión ascendente, debe ser de menos a mas. */
            this.minutos += (this.segundos/60); 
            this.segundos %=(60); 
            this.horas += (this.minutos/60);
            this.minutos %=60;
    }
    
    // Para modificar la hora en cualquier momento // Esto es un método
    
    public void setHora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public String mostrarHora() {
    return "horas: " + horas + "\nminutos: " + minutos + "\nsegundos: " + segundos;
    }
}
