/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer82_corregido;

/**
 *
 * @author usuario
 */
public class cielo {

    // Aray bidimensional de objetos
    private Estrellas estrellitas[][];

    public cielo(int nfillas, int ncolumnas) {
        this.estrellitas = new Estrellas[nfillas][ncolumnas];

        for (int i = 0; i < estrellitas.length; i++) {
            for (int j = 0; j < estrellitas[i].length; j++) {
                estrellitas[i][j] = null; // En esta variable debería ir un objeto, pero no hay nada
            }
        }
    }

    public void ponerEstrellas(int estrellas) {
        // El total del cielo es nfilas * ncolumnas
        //int tamañoTotal = this.estrellitas.length*(this.estrellitas[0].length);

        for (int i = 0; i < estrellas; i++) {
            int xAle = (int) (Math.random() * estrellitas.length);             /* Esto pone una estrella /*/
            int yAle = (int) (Math.random() * estrellitas[0].length);
            this.estrellitas[xAle][yAle] = new Estrellas(xAle, yAle);

            if (this.estrellitas[xAle][yAle] == null) {
                /* Para que no se pueda sobreescribir una estrella */
                this.estrellitas[xAle][yAle] = new Estrellas(xAle, yAle);
            } else {
                i--;
            }
        }
        
    }
    
    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.estrellitas.length; i++) {
            for (int j = 0; j < this.estrellitas[i].length; j++) {
                if (this.estrellitas[i][j]==null) {
                    res += " ";
                }
                else {
                   res += this.estrellitas[i][j].toString();
                }
            }
            res += "\n";
        }
        return res;
    }

}
