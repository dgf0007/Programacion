
/* Author Danie García Fernándezl */
package Ejer2;

public class testCuentaCorriente {

    public static void main(String[] args) {

        cuentaCorriente univia = new cuentaCorriente("Jaime Hormiga", "23567897F");

        univia.setLimiteDescubierto(-50);
        univia.ingresar(1000);
        univia.retirar(300);
        System.out.println(univia);

       univia.retirar(700);
       
        System.out.println(univia);
        univia.retirar(200);
        System.out.println(univia);

        cuentaCorriente cuentaMillonario = new cuentaCorriente(univia);
        cuentaMillonario.ingresar(9000);
        cuentaMillonario.retirar(500);
        System.out.println(cuentaMillonario);
    }

}
