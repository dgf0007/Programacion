
package Ejer66_2;

/* @author daniel */
public class coche {
    
        String color;
        double anchura;
        double altura;
        int puertas;
        boolean ruedas=true;
        boolean arrancar=false;
        int gasolina=25;
        boolean chequear=false;
        
        public coche(String color, double anchura, double altura, int puertas, boolean ruedas) {
            this.color=color;
            this.anchura=anchura;
            this.altura=altura;
            this.puertas=puertas;
            this.ruedas=ruedas;
            this.arrancar=arrancar;
            this.gasolina=gasolina;
            this.chequear=chequear;
        }
        
        public void arrancar(){
            if (this.arrancar==false) {
                if (this.gasolina>=5) {
                System.out.println("El coche se ha arrancado ");
                    this.gasolina -=5;
                }
                else {
                    System.out.println("El coche no tiene suficiente gasolina");
                }
            }
            else {
                System.out.println("El coche no se ha podido arrancar o ya estaba arrancado");
            }
        }
        
        public void parar(){
            if (this.arrancar==false){
                System.out.println("El coche ha parado");
            }
            else {
                System.out.println("El coche no se ha parado, por que no se había arrancado");
            }
        }
        
        public void desplazarse() {
            if (this.arrancar==false) {
                if (this.gasolina>=20) {
                System.out.println("El coche se puede desplazar");
                    this.gasolina-=20;
                }
                else {
                    System.out.println("El coche no tiene gasolina para desplazarse");
                }
            }
            else {
                System.out.println("El coche no se puede desplazar, por que no se ha arrancado");
            }
        }
        
        public void chequear(){
            if (this.gasolina>0) {
                this.chequear=true; 
                System.out.println(this.chequear);
            }
            else {
                this.chequear=false;
                System.out.println(this.chequear);
            }
        }
   
        public void echargasolina(int litros){
          if (arrancar==false) {
              this.gasolina+=litros;
              if (this.gasolina>=50) {
                  this.gasolina=50;
              }
          }
            
        }
}
