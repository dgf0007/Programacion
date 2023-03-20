package Ejer2;

/*@author Daniel García Fernández */
public class cuentaCorriente {

    private int saldo = 0;
    private int limiteDescubierto = 100; // Significa que el banco me presta 100€, yo puedo sacar hasta 600
    String nombre;
    String dNI;
    private String banco = "Sr Hormiga Bank";

    // De este ejercicio he realizado desde el apartado A, hasta el apartado D
    // Apartado A
    public cuentaCorriente(String nombre, String dNI) {
        this.saldo = saldo;
        this.limiteDescubierto = limiteDescubierto;
        this.nombre = nombre;
        this.dNI = dNI;
        this.banco = banco;
    }

    public String ingresar(int ingreso) {
        if (ingreso <= 0) {
            return "La cantidad ingresada es negativa";
        } else {
            this.saldo += ingreso;
            return "La cantidad se ha ingresado correctamente";
        }
    }

    public String retirar(int retiro) {
        if (this.saldo +- this.limiteDescubierto < retiro) {
            return "No se ha podido retirar esa cantidad";
        } else {
            this.saldo -= retiro;
            return "Se ha retirado el saldo correctamente";

        }
    }

    // Fin Apartado A
    // Apartado B
    public cuentaCorriente(int saldo) {
        this.saldo = saldo;
        this.limiteDescubierto = 0;
        this.nombre = "sinDatos";
        this.dNI = "sinDatos";
    }

    public cuentaCorriente(int saldo, int limiteDescubierto, String dNI) {
        this.saldo = saldo;
        this.limiteDescubierto = limiteDescubierto;
        this.dNI = dNI;
        this.nombre = "sinDatos";
    }

    // Fin Apartado B
    // Apartado C
    // En el apartado C, lo primero que hago es cambiar a private los atributos limiteDescubierto, dNi y banco.
    // Una vez creado los atributos privados, me dispongo a crear los getter y setter de dichos atributos, para que puedan ser utilizados fuera de la clase.
    public int getSaldo() { // Getter creado Tiene tipo de retorno de la variable en concreto
        return this.saldo;
    }

    public void setSaldo(int saldo) { // Setter creado, Tiene que tener un parámetro dentro
        this.saldo = saldo;   // El primero hace referencia al atributo de clase y el segundo a un parámetro.
    }

    public int getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    public void setLimiteDescubierto(int limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    public String getDNI() {
        return this.dNI;
    }

    public void setDNI(String dNI) {
        this.dNI = dNI;
    }

    // Fin Apartado C
    // Apartado D 
    // En este apartado creo un constructor de opia del constructor cuentaCorriente
    public cuentaCorriente(cuentaCorriente otraCuenta) {
        this.saldo = otraCuenta.saldo;
        this.limiteDescubierto = otraCuenta.limiteDescubierto;
        this.nombre = otraCuenta.nombre;
        this.dNI = otraCuenta.dNI;
        this.banco = otraCuenta.banco;
    }

    // Fin Apartado D
    @Override
    public String toString() {
        String res = "";
        res += "\n--------------------------------------";
        res += "\n Títular: " + this.nombre + " DNI: " + this.dNI;
        res += "\n Saldo : " + this.saldo;
        res += "\n Límite : " + this.limiteDescubierto;
        return res;
    }
}
