/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer82;

/**
 *
 * @author danie
 */
public class Cielo {

    private Estrella cielo[][]; //Creo un array bidimensional de objetos (Estrella para el cielo)

    public Cielo(int nfilas, int ncolumnas) {
        this.cielo = new Estrella[nfilas][ncolumnas]; // Incializo el array El tamaño lo se en el constructor

        //Para recorrer una matriz bidimensional
        for (int i = 0; i < cielo.length; i++) { //En estge caso se puede poner nfilas
            for (int j = 0; j < cielo[i].length; j++) { //En este caso se puede poner ncolumnas
                cielo[i][j] = null; //En esa variable debería ir un objeto, pero no hay nada-
            }
        }
    }

    public void ponerEstrellas(int totalEstrellas) {
        //Tamaño máximo del cielo es totalEstrellas.length
        //int tamañoTotal = this.cielo.length * this.cielo[0].length;

        //int xAle = (int) (Math.random() * this.cielo.length ); //Posicion aleatoria para las filas
        //int yAle = (int) (Math.random() * this.cielo[0].length); //Posición de las columnas
        // Me voy a la posición 0 de mi array, en la que tengo otra lista de cajones, y para saber el total de columnas, le pongo el .length
        
        //Voy a poner una estrellas en esa posición
        //this.cielo[xAle][yAle] = new Estrella(yAle, yAle);
        
        //Pàra poner nestrellas 
        for (int i = 0; i < totalEstrellas; i++) { //Array para poner estrellas en todo el sitio posible
            int xAle = (int) (Math.random() * this.cielo.length); //Posicion aleatoria para las filas
            int yAle = (int) (Math.random() * this.cielo[0].length); //Posición de las columnas
            // Me voy a la posición 0 de mi array, en la que tengo otra lista de cajones, y para saber el total de columnas, le pongo el .length

            //Pàra poner nestrellas
            if (this.cielo[xAle][yAle] == null) {
                this.cielo[xAle][yAle] = new Estrella(yAle, yAle);
            } else {
                i--; //Quitamos 1 en caso de que se coloque una estrella, se quita si está ocupada
                // Por ejemplo si me sale el [2][2], me echa para atras y vuelve a realizar otra vuelta
            }
        }
    }

    public String toString() {
        //Para sacar la matriz por filas y por columnas
        String res = "";
        for (int i = 0; i < cielo.length; i++) {
            for (int j = 0; j < cielo[i].length; j++) {
                if (this.cielo[i][j] == null) {
                    res += " ";
                } else {
                    res += this.cielo[i][j].toString();
                }
            }
            res += "\n";
        }
        return res;
    }
}
