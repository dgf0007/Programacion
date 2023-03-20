package Ejer101;

/**
 *
 * @author danie
 */
public abstract class Instrumento {

    String marca;
    int mes;
    int anio;
    Partitura partiCompleta;
    boolean tocando;
    boolean aniadirNota;
    boolean romperse;

    public Instrumento(String marca, int mesFabricacion, int anoFabricacion, Partitura partitura) {
        this.marca = marca;
        this.mes = mesFabricacion;
        this.anio = anoFabricacion;
        this.partiCompleta = partitura;
        this.tocando = false;
        this.aniadirNota = false;
        this.romperse = false;
    }

    public Instrumento(String marca, int mesFabricacion, int anoFabricacion) {
        this.marca = marca;
        this.mes = mesFabricacion;
        this.anio = anoFabricacion;
        this.tocando = false;
        this.romperse = romperse;

        // A partir de aquí son los apartados 1,2 y 3 
    }

    public boolean aniadirNota() {
        int numNotas = (int) ((Math.random() * 101 - 10) + 10); // Para generar un numero aleatorio de notas
        this.partiCompleta = new Partitura("desconocido", "desconocido"); //Para poner el nobre y autor en desconido

        //Realizo un array de Strings
        String[] valores = {"do", "re", "mi", "fa", "sol", "la", "si"}; // Para generar las notas aleatoriamente
        for (int i = 0; i < numNotas; i++) {

            String randomValor = valores[(int) (Math.random() * 6)]; //Para generar aleatorios entre las notas
            int randomDuracion = (int) (Math.random() * 5 + 1); //Para calcular una duración aleatoria entre 1 y 5
            Nota nota = new Nota(randomValor, randomDuracion);
            this.partiCompleta.addNota(nota); //Añadir una nota nueva (trae de partitura el addNota)
        }
        
        if (this.partiCompleta.equals(valores)) { //Para comprobar si se ha añadido la nota o no
            return this.aniadirNota = true;
        }
        else {
            return this.aniadirNota = false;
        }
    }
    
    public boolean tocarPartitura() {
        if (this.romperse == true) {
            return this.tocando = false;
        }
        else {
            return this.tocando = true;
        }
    }
    
    public boolean pararDeTocar() {
        return this.tocando = false;
    }
    
    public void afinarse() {
    }


    public String toString() {
        String res = "";
        res += "Instrumento de marca " + marca + ", fabricado en " + mes + "/" + anio
                + " está tocando: " + tocando + "\n" + partiCompleta;
        return res;
    }
}
