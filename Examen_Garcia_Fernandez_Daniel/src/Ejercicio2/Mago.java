/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author usuario
 */
public class Mago extends Heroe { /* En esta clase
    he usado herencia para que perteneza a Heroe, 
    y también permite la lclase abstracta de Heroe*/

    protected int inteligencia;
    protected int fuerza;
    protected boolean muerto;
    protected int destreza;
    protected int vida;

    public Mago(String nombre) {
        super(nombre);
        this.inteligencia = (int) ((Math.random() * 22 - 12) + 12);
        this.fuerza = (int) ((Math.random() * 10 - 5) + 5);
        this.destreza = (int) ((Math.random() * 10 - 2) + 2);
        this.vida = (int) ((Math.random() * 10 - 2) + 2);
        this.muerto = false;
        this.esquive = true;
    }

    public void curarse() {
        this.vida += 3;

        if (this.vida > 10) {
            this.vida = 10;
        }
        System.out.println(this.nombre + "se ha curado 3 puntos");
    }

    @Override
    public boolean esquivar() {
        int Random = (int) ((Math.random() * 40 - 2) + 2);

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
            defensor.vida -= this.fuerza / 2;
        }

    }

    @Override
    public String toString() {
        String res = " ";
        res += "\nNombre: " + this.nombre;
        res += "\nTipo: " + "Mago";
        res += "\nInteligencia: " + this.inteligencia;
        res += "\nFuerza: " + this.fuerza;
        res += "\nVida: " + this.vida;
        return res;
    }
}
