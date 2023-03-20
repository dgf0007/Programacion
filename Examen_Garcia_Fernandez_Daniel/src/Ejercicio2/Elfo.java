/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Daniel García Ferández
 */
public class Elfo extends Heroe { /* En esta clase
    he usado herencia para que perteneza a Heroe, 
    y también permite la lclase abstracta de Heroe*/

    protected int inteligencia;
    protected int fuerza;
    protected boolean muerto;
    protected int destreza;
    protected int vida;

    public Elfo(String nombre) {
        super(nombre);
        this.inteligencia = (int) ((Math.random() * 15 - 7) + 7);
        this.fuerza = (int) ((Math.random() * 14 - 5) + 5);
        this.destreza = (int) ((Math.random() * 20 - 12) + 12);
        this.vida = (int) ((Math.random() * 12 - 5) + 5);
        this.muerto = false;
    }

    public void rapidez() {
        this.destreza += 5;
        this.fuerza -= 5;

        System.out.println(this.nombre + "ha usado rapidez. Ahora su destreza es "
                + this.destreza + " y su fuerza es " + this.fuerza);
    }

    @Override
    public boolean esquivar() {
        int Random = (int) ((Math.random() * 50 - 4) + 4);

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
            defensor.vida -= this.fuerza / 3;
        }

    }

    @Override
    public String toString() {
        String res = " ";
        res += "\nNombre: " + this.nombre;
        res += "\nTipo: " + "Elfo";
        res += "\nInteligencia: " + this.inteligencia;
        res += "\nFuerza: " + this.fuerza;
        res += "\nVida: " + this.vida;
        return res;
    }
}
