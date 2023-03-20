
/* Author Daniel */
package Garcia_Fernandez_Daniel_3;

public class T1P3 {

    public static void main(String[] args) {
        String modelo = "0";
        int memoria = 0;
        double megap = 0;
        double gramos = 0;
        
        boolean pulgadas=true;
        boolean version=true;
        tablet tablet1 = new tablet(modelo="Xiaomi", memoria=4086 , megap= 10.1, gramos= 2400, pulgadas, version);
        tablet1.encender();
        System.out.println(tablet1.gramos);
        System.out.println(tablet1.marca);
        System.out.println(tablet1.megap);
        System.out.println(tablet1.memoria);
    }
}
