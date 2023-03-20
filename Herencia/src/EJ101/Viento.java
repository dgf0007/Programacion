/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ101;

/**
 *
 * @author usuario
 */
public abstract class Viento extends Instrumento{
    boolean metal; //Si es false es madera.
    public Viento(String marca, String fecha, Partitura P1, boolean metal){
        super(marca, fecha, P1);
        this.metal=metal;
}

    @Override
    public abstract String tocarPartitura();


    @Override
    public abstract String pararDeTocar();
    
        public abstract String afinar();

    
}
