
/* Author Daniel */
package Ejer76;

public class testUrna {

    public static void main(String[] args) {

        int bn = (int) (Math.random() * 10 + 1);
        int bb = (int) (Math.random() * 10 + 1);

        // Urna Victor = new Urna(bb, bn);
        Urna victor = new Urna(bb, bn);
        System.out.println("Se ha creado la urna con " + bb+ " bolas negras " + "y " +bn+ " bolas blancas") ;

        while (victor.totales() >= 1) {
            char una = victor.extraer();
            System.out.println("Se ha extraido una bola " +una);
            char otra = victor.extraer();
            System.out.println("Se ha extraido otra bola "  +otra);
                

            if (una == otra) {
                victor.meterBola('b');
                System.out.println("Se ha metido una bola blanca ");
            } else {
                victor.meterBola('n');
                System.out.println("Se ha metido una bola negra ");
            }
        }
        
        char ultima = victor.extraer();
        System.out.println("La última bola es " +ultima);

    }

}
