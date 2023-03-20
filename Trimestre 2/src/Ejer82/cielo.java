package Ejer82;

/* @author usuario*/
public class cielo {

    int filas;
    int columnas;
    int totalEstrellas;

    public cielo(int filas, int columnas, int totalEstrellas) {
        this.filas = filas;
        this.columnas = columnas;
        this.totalEstrellas = totalEstrellas;
       Estrella cielo[][] = new Estrella[this.filas][this.columnas]; // Crear array bd para con filas y columnas introducidas por el user, vacia
        
        for (int i = 0; i < cielo.length; i++) {
            for (int j = 0; j < cielo[i].length ; j++) {
                cielo[i][j] = new Estrella(this.filas, this.columnas);
            }
            
        }


    }
}
