package Ejer1;

/* @author Daniel García Fernández*/
public class Rectangulo {

    private double base;
    private double altura;
    double area;
    double perimetro;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = this.base * this.altura;
        this.perimetro = 2 * (this.base + this.altura);
    }

    public double calcArea() {
        return this.area;
    }

    public double calcPerimetro() {
        return this.perimetro;
    }

    @Override
    public String toString() {
        String res = "";
        res += "\n----------------------------------------";
        res += "\nRectángulo con base X y altura Y ";
        res += "\nArea: " + this.area;
        res += "\nPerímetro " + this.perimetro;
        res += "\n----------------------------------------";
        return res;
    }
}
