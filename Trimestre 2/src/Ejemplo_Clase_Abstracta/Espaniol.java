package Ejemplo_Clase_Abstracta;

/* @author usuario*/

public abstract class Espaniol extends Persona{ // Se pone abstracta la clase
    boolean bailarFlamenco;

    public Espaniol (String nombre, int edad, boolean sexo, boolean fiesta) {
        super(nombre, edad, sexo);
        this.bailarFlamenco = fiesta;
    }
   @Override
    public void hablar() {
        System.out.println("Buenas tardes");
    }
}
