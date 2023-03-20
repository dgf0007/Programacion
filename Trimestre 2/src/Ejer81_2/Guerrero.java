/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer81_2;

/* @author Daniel*/
public class Guerrero {

    private String nombre;
    private int saludTotal;
    private int ataque;
    private int escudo;
    private int saludActual;
    private boolean muerto;
    private Arma weapon;
    private int nivel; // Nivel del guerrero
    private int experienciaActual; // Experiencia actual del guerrero
    private double siguienteNivel; // Siguiente nivel del guerrero

    public Guerrero(String nombre, int ataque, int escudo, Arma weapon) {
        this.nombre = nombre;
        this.saludTotal = 100;
        this.ataque = ataque;
        this.escudo = escudo;
        this.saludActual = saludTotal;
        this.muerto = false;
        this.weapon = weapon;
        this.nivel = 1;
        this.experienciaActual = 0;
        this.siguienteNivel = Math.round(this.nivel*10+this.nivel*1.5);
        

    }

    public void atacar(Guerrero defensor) {
        int golpe;
         //Comprobar si la resistencia es positiva
        if (this.weapon.getResistencia()>=0) {
         // Comprobar que pierde resistencia el arma
        golpe = this.ataque+this.weapon.getPoder()-defensor.escudo;
        }
        else {
            golpe = this.ataque-defensor.escudo;
        }
       
        // Atacar al guerrero que defiende
        
        this.weapon.setResistencia(this.weapon.getResistencia()-1);
       
        
        //Copruebo que el daño es positivo
        if (golpe > 0 ) {
            defensor.saludActual -=golpe;   
        }
        
        // Verificar si el guerrero ha muerto
        
        if (defensor.saludActual >0) {
           defensor.muerto =false;
        }
        else {
            defensor.muerto = true;
        }
    }
    
    public void mejorarArma(String arma) {
        if (this.weapon.getNombre().equalsIgnoreCase(arma)) {
            weapon.subirNivel(); // Para subir de nivel el arma
        }
    }
    
    public void subir() {
        if (Guerrero.this.weapon.subirNivel()) {
            
        }
    }

    public String toString() {
        String res = "";
        res += "\n El nombre del guerrero es" + this.nombre;
        res += "\n La salud total del guerrero es" + this.saludTotal;
        res += "\n El ataque del guerrero es " + this.ataque;
        res += "\n El escudo del guerrero es " + this.escudo;
        res += "\n La salud actual del guerrero es " + this.saludActual;
        return res;
    }
}
