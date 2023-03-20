package Ejer82;

/**
 * @author usuario
 */
public class Estrella {

    private double posicionX;
    private double posicionY;
    private String forma; // Creo la variable forma

    public Estrella(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;

        // Decidir la forma:
        int alf = (int) (Math.random() * 3 + 1);
        if (alf == 1) {
            this.forma = "*";
        } else {
            this.forma = ".";
        }

    }

    public String toString() {
        String res = " ";

        res += "\nLa estrella tiene las coordenadas" + this.posicionX + " de latitud y de longitud" + this.posicionY;
        res += "La forma de la estrellas es" + this.forma;
        return res;
    }

}
