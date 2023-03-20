
package Ejemplo_Clase_Abstracta;

/**
 *
 * @author usuario
 */
public class Ingles extends Persona {
    boolean balconing;

    public Ingles(String nombre, int edad, boolean sexo, boolean fiesta) {
        super(nombre, edad, sexo);
        this.balconing = fiesta;
        
    }
    
    @Override
    public void hablar() {
        System.out.println("Good Morning");
    }
}
