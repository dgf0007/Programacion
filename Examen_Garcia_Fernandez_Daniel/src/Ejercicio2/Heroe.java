
package Ejercicio2;

/**
 *
 * @author Daniel García Fernández
 */
public  abstract class Heroe { //Esta es la clase principal de la que parte el resto de heroes
    //Creo los atributos
    protected String nombre;
    protected int inteligencia;
    protected int fuerza;
    protected boolean muerto;
    protected int destreza;
    protected int vida;
    protected  boolean  esquive;
    
    //Pongo los atributos con las características que me dice el pdf
    public Heroe(String nombre) {
        this.nombre = nombre;
        this.inteligencia = 0;
        this.fuerza =0;
        this.muerto = false;
        this.destreza = 0;
        this.vida = 0;
        this.esquive = false;
    }
    
    //Creo el método esquivar y ataca  que posteriormente el resto de héroes usaran a su gusto
    public boolean esquivar()  {
        return esquive = false;
    }
    
    public void ataca(Heroe defensor) {
        
    }
    
    //Por último creo el método toString
    public String toString() {
        String res = " ";
        return res;
    }
    
}
