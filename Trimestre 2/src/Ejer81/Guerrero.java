    package Ejer81;

/* @author Daniel */
public class Guerrero {

    private String nombre; //Nombre del guerrero
    private double saludMax; //Vida del guerrero
    private int ataque; //Fuerza del guerrero
    private int escudo; //Resistencia a golpes del guerrero
    // El toString no saca por pantalla, solo lo almacena
    private double saludActual; //Indica la salud que tiene el guerrero en cada momento
    boolean muerto = false;

    private arma weapon;

    public Guerrero(String nombre, double salud, int ataque, double escudo, boolean muerto, arma golosa) {
        this.nombre = nombre;
        this.saludMax = saludMax;
        this.ataque = ataque;
        this.escudo = (int) escudo;
        this.saludActual = saludMax;
        this.muerto = muerto;
        this.weapon = golosa;
    }

    public int atacar(Guerrero defensor) {

        if (!this.muerto) { //Metodo que hace devolver un número
            //return this.ataque+this.weapon.getPoder();  
            int hostion;   
            if (this.weapon.getResistencia() > 0 ) {
                hostion = (int) ((this.ataque+this.weapon.getPoder())-defensor.escudo);
            }
            else {
                hostion = this.ataque-defensor.escudo;
            }
            
            // veo si ha muerto el defensor
            
            if (defensor.saludActual <=0) {
                defensor.muerto = true;
            }

            // quito resistencia al arma
            
            int kaka = this.weapon.getResistencia(); // traigo la resistencia del arma
            kaka --;
            this.weapon.setResistencia(kaka);
            
            // Modo pablo : this.weapon.setResistencia(this.weapon.getResistencia()-1)
            
        } else {
            //return this.ataque+this.weapon.getPoder();
            System.out.println(this.nombre + " Está muerto ");
        }
        return 0;
    }

    @Override
    public String toString() {
        String res = " ";
        res += " \nEl nombre es " + this.nombre;
        res += "\nSu salud es " + this.saludActual;
        res += " \nsu ataque es de " + this.ataque;
        res += "\n su escudo es " + this.escudo;
        res += " \nsu salud actual es " + this.saludActual;

        return res;
    }

}
