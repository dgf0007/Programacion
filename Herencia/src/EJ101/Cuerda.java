/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ101;

/**
 *
 * @author usuario
 */
public abstract class Cuerda extends Instrumento {
    int nCuerdas;
    boolean pulsada; //Si no es pulsada es percutida
    
    public Cuerda(String marca, String fecha, Partitura P1,int nCuerdas, boolean pulsada){
    super(marca, fecha, P1);
    if(nCuerdas<1){
    this.nCuerdas=1;
    }
    else{
    this.nCuerdas=nCuerdas;
    }
    this.pulsada=pulsada;
    }

    @Override
    public abstract String tocarPartitura();
    
    @Override
    public abstract String pararDeTocar();
    
        public abstract String afinar();

    
}
