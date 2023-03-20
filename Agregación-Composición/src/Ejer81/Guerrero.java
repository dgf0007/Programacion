/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer81;

/**
 *
 * @author danie
 */
public class Guerrero {
    private String nombre; //Nombre del guerrero
    private int saludMax; //Salud máxima del guerrero
    private int ataque; //Ataque del guerrero
    private int escudo; //Escudo del guerrero
    private int saludActual; //Salud actual del guerero
    private boolean muerto;
    private arma weapon;
    private int nivel;
    private int experienciaActual;
    private int siguienteNivel;
    private boolean subirNivel;
    
    
    public Guerrero(String nombre, int ataque, int escudo, arma weapon) {
        this.nombre = nombre;
        this.saludMax = 100;
        this.ataque = ataque;
        this.escudo = escudo;
        this.saludActual = this.saludMax;
        this.muerto = false;
        this.weapon = weapon;
        this.nivel = 1;
        this.experienciaActual = 0;
        this.siguienteNivel = (int) Math.ceil(nivel * 10 + nivel * 1.5);
        this.subirNivel = false;
    }
    
    //Comprobar si el guerrero esta muerto
    public void atacar(Guerrero defensor ) {
        
        int hostion = (this.ataque + weapon.getPoder()) - defensor.escudo;
        if (this.muerto == false) {
            //Comprobar que el ataque no puede ser negativo
            
            if (hostion <0 ) {
               hostion = 0; 
            }
            
            // Comprobar que tenga en cuenta el poder del arma
            //return this.ataque + weapon.getPoder();
            
            // Atacar debe quitarle vida al guerrero defensor
            
            defensor.saludActual = hostion;
            
            //Comprobar que el defensor está vivo
            
            if (defensor.saludActual >0) {
                defensor.muerto = false;
            }
            else {
                defensor.muerto = true;
                System.out.println("El defensor está muerto");
            }
            
            // Hacer que el arma del guerero pierda resistencia
            
            this.weapon.setResistencia(this.weapon.getResistencia()-1);
            
            if (this.weapon.getResistencia() <=0) {
                this.ataque = 0;
            }
            
            // Hacer que el guerero gane puntos de experencia 
            
            if (Guerrero.this.weapon.getResistencia()>0) {
                    this.experienciaActual +=3;
                }
                else {
                    this.experienciaActual +=5;
                }
                
            
        }
        else {
            //return 0;
        }
    }
    
    public void mejorarArma(String nombreArma) {
        if (weapon.getNombre().equalsIgnoreCase(nombreArma)) {
            this.weapon.subirNivel();
        }
    }
    
    public boolean subir() {
        if (this.experienciaActual == siguienteNivel) {
            return this.subirNivel = true;
        }
        else {
            return this.subirNivel = false;
        }
    }
    
    public void subidaNivel()  {
       Guerrero.this.nivel ++;
       Guerrero.this.experienciaActual = 0;
       subir();
       Guerrero.this.ataque ++;
       Guerrero.this.escudo ++;
       Guerrero.this.saludMax +=10;
    }
    
    @Override
    public String toString() {
        String res = "";
        res += "\nEl nombre del guerrero es " +this.nombre;
        res += "\nLa salud del guerrero es " +this.saludActual;
        res += "\nEl ataque del guerrero es " +this.ataque;
        res += "\nEl escudo del guerrero es " +this.escudo;
        return res;
    }
}
 