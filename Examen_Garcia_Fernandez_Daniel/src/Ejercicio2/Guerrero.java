/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author usuario
 */
public class Guerrero extends Heroe { /* En esta clase
    he usado herencia para que perteneza a Heroe, 
    y también permite la lclase abstracta de Heroe*/

    protected int inteligencia;
    protected int fuerza;
    protected boolean muerto;
    protected int destreza;
    protected int vida;

    public Guerrero(String nombre) {
        super(nombre);
        this.inteligencia = (int) ((Math.random() * 5 - 3) + 3);
        this.fuerza = (int) ((Math.random() * 27 - 12) + 12);
        this.destreza = (int) ((Math.random() * 8 - 2) + 2);
        this.vida = (int) ((Math.random() * 20 - 8) + 8);
        this.muerto = false;
    }

    public void furia() {

        if (this.vida <= 0) {
            this.fuerza = 0;
            this.vida = 0;
        } else {
            this.fuerza += 5;
            this.vida -= 6;
        }
        System.out.println(this.nombre + " ha usado furia. Ahora su fuerza es" + this.fuerza + "y su vida es " + this.vida);

    }

    @Override
    public boolean esquivar() {
        int Random = (int) ((Math.random() * 30 - 3) + 3);

        if (Random < this.destreza) {
            return this.esquive = true;
        } else {
            return this.esquive = false;
        }
    }

    @Override
    public void ataca(Heroe defensor) {
        defensor.esquivar();
        if (defensor.esquive = true) {
            System.out.println("No recibe daño");
        } else {
            defensor.vida -= this.fuerza;
        }

    }

    @Override
    public String toString() {
        String res = " ";
        res += "\nNombre: " + this.nombre;
        res += "\nTipo: " + "Guerrero";
        res += "\nInteligencia: " + this.inteligencia;
        res += "\nFuerza: " + this.fuerza;
        res += "\nVida: " + this.vida;
        return res;
    }
}
