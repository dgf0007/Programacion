package Ejer72;

/* @author Daniel*/
public class Persona {

    String nombre;
    int edad;
    boolean sexo;
    String pais;

    /* teclado.next().charAt(0) */
    public Persona(String nombrecito, int edad, boolean sexo, String pais) {
        this.nombre = nombrecito;
        this.edad = edad;
        this.sexo = true;
        this.pais = pais;
    }

    public void saludar(int num) {

        switch (num) {
            case 1:
                System.out.println("Que dise el titi \n");
                break;
            case 2:
                System.out.println("Sup bro \n");
                break;
            case 3:
                System.out.println("Me pide leche \n");
                break;
            default:
                System.out.println("Castigado 5 minutos sin amigos \n");
        }     
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }

    public void EsMayorEdad() {
        if (this.edad >= 18) {
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += "Datos de la persona:\n";
        /* Una opción */
        res += this.nombre + "\n";
        res += this.edad + "\n";
        res += this.sexo + "\n";
        res += this.pais + "\n";

        if (this.edad >= 18) {
            res += "Es mayor de edad";
        } else {
            res += "No es mayor de edad";
        }
        return res;
    }
    /*return "Datos de la persona:\n"+ this.nombre +"\n"+this.edad+ "\n"+this.sexo +"\n"+this.pais +"\n"; otra opción */
}
