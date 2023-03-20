package Ejer69;

/* @author Daniel*/
public class Hora {

    private int horas;
    /* private == variable privada, antes del "int" */
    private int minutos;
    private int segundos;

    public Hora() {
        this.horas = 0;
        /* Inicializar a 0 */
        this.minutos = 0;
        /* por defecto */
        this.segundos = 0;
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        /* Este constructor es el que recoge los datos */
        this.segundos = segundos;
    }

    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
        /* Este constructor es el que recoge los datos de horas y minutos */
        this.segundos = 0;
    }

    public Hora(int horas) {
        this.horas = horas;
        this.minutos = 0;
        /* Este constructor recoge los datos de horas */
        this.segundos = 0;
    }

    public void getHora(int horas) {
        this.horas += horas;
    }

    public void getMinutos(int minutos) {
        if (minutos > 59) {
            this.horas += minutos / 60;
            /* minutos + de 60 */
            this.minutos += minutos % 60;
            /* el resto de minutos sobrantes */
            if (this.minutos > 59) {
                this.horas += minutos / 60;
                this.minutos = minutos % 60;
            }
        } else if (minutos <= 59 && minutos >= 0) {
            this.minutos = minutos;
        } else {
            System.out.println("Error, Minutos incorrectos");
        }
    }

    public void getSegundos(int segundos) {
        if (segundos > 59) {
            int aux = segundos / 60;
            this.segundos = segundos % 60;
            getMinutos(aux);
        } else if (segundos <= 59 && segundos >= 0) {
            this.segundos = segundos;
        } else {
            System.out.println("Error, Segundos Incorrectos");
        }
    }

    @Override
    /* Permite escoger el ToString creado por el programadro */
    public String toString() {
        return "horas: " + horas + "\nminutos: " + minutos + "\nsegundos: " + segundos;
        /* return para devolver */
    }
}
