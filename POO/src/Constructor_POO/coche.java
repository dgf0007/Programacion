package Constructor_POO;

/* @author daniel */
public class coche {
    
    String color;
    double anchura;
    double altura;
    int puertas;
    boolean ruedas;
    boolean arrancado;
    boolean desplazarse;
    int gasolina;
    
    public coche(String color, double anchura, double altura, int puertas, boolean ruedas) {
        this.color=color;
        this.anchura=anchura;
        this.altura=altura;
        this.puertas=puertas;
        
        this.ruedas = true;
        this.arrancado=false;
        this.gasolina=25;
    }
    public void arrancar(){
        
        if (this.arrancado==true) {
            System.out.println("El coche ya estaba arrancado");
        }
        else if (this.arrancado==false) {
            if (this.gasolina>=5) {
            System.out.println("El coche se ha arrancado");
            this.gasolina-=5;
            }
            else {
                System.out.println("El coche no tiene suficiente gasolina para arrancar");
            }
        }      
    }
    
    public void parar(){
        if (this.arrancado==true) {
            System.out.println("El coche se ha parado");
        }
        
        else if (this.arrancado==false) {
            System.out.println("El coche ya estaba parado");
        }
    }
    
    public void desplazarse(){
        if (arrancado==true) {
            if (this.gasolina>=20) {
            System.out.println("El coche se puede mover");
            this.gasolina-=20;
            }
            else {
                System.out.println("No hay suficiente gasolina para mover el coche");
            }
        }   
         else {
                  System.out.println("Es necesario arrancar el coche para que se mueva ");
         }   
        }
    public void echargasolina(int litros){
        if (arrancado==true) {
            this.gasolina+=litros;
            if (this.gasolina>50) {
                this.gasolina = 50;
            }
        }
    }
}
