/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejer74;

/**
 *
 * @author danie
 */
public class Prueba74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro workook = new Libro("El arte de la guerra", "Shon LI", 729, 12);
        Libro juanop = new Libro("Doraemon", "akona", 719, 782);
        System.out.println(workook);
        System.out.println(juanop);

        // Para llamar a un seter
        workook.setAutor("Francisco");
        juanop.setAutor("pedro");

        if (workook.getNumPaginas() > juanop.getNumPaginas()) { //Es posible tratarlo como num
            System.out.println("El mayor es " + workook.titulo());
        }
        else if (workook.getNumPaginas()== juanop.getNumPaginas()) {
            System.out.println("Es un empate");
        }
        else {
            System.out.println("El mayor es " +juanop.titulo() );
        }
        
    }
}
