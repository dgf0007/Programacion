package Ejer75;

/**
 *
 * @author danie*/
public class Cuenta {

    private String titular;
    private int cantidad;

    public Cuenta(String titular, int cantidad) { // Ester recibe ambas cosas
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Cuenta(String titular) { // Ester recibe Solo titular
        this.titular = titular;
        this.cantidad =0; // Para decidir un inicio de variable
    }    
    public Cuenta(Cuenta otraCuenta) {// Contructor de copia, Lo que recibe por parámetro es un objeto de su misma clase
      // Su objetivo es copiar uno a uno todos los paámetros de la cuenta anterior a la nueva
        this.titular = otraCuenta.titular; // Crear un objeto identico en contenido a otro del mismo tipo
        this.cantidad = otraCuenta.cantidad;
    }
    
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(int ingreso) {
        if (ingreso <= 0) {
            System.out.println("La cantidad ingresada es negativa");
        } else {
            this.cantidad += ingreso;
        }
    }

    public void retirar(int retiro) {
        if (this.cantidad < retiro) {
            System.out.println("No hay suficiente dinero en la cuenta");
        } else {
            this.cantidad -= retiro;

        }
    }

    @Override
    public String toString() {
        String res = "";
        res += "Esta cuenta pertenece a " + this.titular + " y posee actualmente una cantidad de " + this.cantidad;
        return res;
    }

}
