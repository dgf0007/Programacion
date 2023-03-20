package Ejer76;

/* @author Daniel */
public class Urna {

    private int numNegras;
    private int numBlancas;

    public Urna(int nbb, int nbn) {
        this.numBlancas = nbb;
        this.numNegras = nbn;

    }

    public int totales() {         // devolver un entero
        return this.numBlancas + this.numNegras;
    }

    public void meterBola(char color) {

        if (color == 'b' || (color == 'B')) {
            this.numBlancas++;
        } else if (color == 'n' || (color == 'N')) {
            this.numNegras++;
        }
    }

    public char extraer() {
        
        int suma = totales();
        int r = (int) (Math.random() * suma + 1);
        if (r <= this.numBlancas) {
            this.numBlancas--;
            return 'b';
        } else {
            this.numNegras--;
            return 'n';
        }
    }
}
// Ejer estudiantes 
// Lista de estudiantes array de double , no se el tamaño, (no se define ) double [] lista;
//En el constructor se crea la lista
// Que son las propiedades y los métodos estáticos. // En teòrico y práctico
// static  (Por ejemplo math. )
