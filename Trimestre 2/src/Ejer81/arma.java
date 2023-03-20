package Ejer81;

/* @author Daniel*/
public class arma {
    
    private String nombre; // Indica el nombre del arma
    private int resistencia; //Indica la resistencia del arma
    private double poder; // Indica el poder que hace el arma
    
    public arma(String nombre, int resistencia, double poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
    }
    
    public String getNombre() { // Permite utilizar la variable privada en otra clase
        return this.nombre;
    }
    
    public int getResistencia() {  // Permite utilizar la variable privada en otra clase
        return this.resistencia;
    }
    
    public void setResistencia(int nuevo) {
        this.resistencia = nuevo;
    }
    
    public double getPoder() {  // Permite utilizar la variable privada en otra clase
        return this.poder;
    }
    
    
      @Override
    public String toString() {
        String res=" ";
        res+=" \nEl nombre es " + this.nombre;
        res+= "\nSu resistencia es " + this.resistencia;
        res += " \nsu poder es de " + this.poder;
        
        return res;
    }
    
    
}
