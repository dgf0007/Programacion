package Garcia_Fernandez_Daniel_3;

/**
 *
 * @author usuario
 */
public class tablet {
    String marca="Xiaomi";
    String modelo="C3PO";
    int memoria=4096;
    double megap=96;
    double gramos=2400;

    boolean pulgadas=true;
    boolean version = true ;
    boolean encender=false;
    
    public tablet(String modelo, int memoria, double megap, double gramos, boolean pulgadas, boolean version) {
        this.marca=marca;
        this.modelo=modelo;
        this.memoria=memoria;
        this.megap=megap;
        this.gramos=gramos;
        this.pulgadas=pulgadas;
        this.version=version;
        this.encender=encender;
    }
    
    
    public void encender(){
        if (this.encender==true) {
            System.out.println("La marca de la tablet es" +marca);
            System.out.println("El modelo de la tablet es " +modelo);
            System.out.println("La versión de la tablet es " +version);
        }
        else {
            System.out.println("La tablet se ha apagado;");
        }
        
    }
    
    
    public String toString(){
        String res="";
        res+="Características de la tablet:\n";
        res+=marca +"--";
        res+=modelo;
        res+="Versión de Android: " +version;
        String pulgadas = null;
        res+="Tamaño: "+pulgadas+ " pulgadas"; 
        res+="Pesa " +gramos+ " gramos";
        res+="Cámara con " +megap+ " megapíxeles";
        if (this.encender==true) {
            System.out.println("La tablet esta encendida");
        }
        else {
            System.out.println("La tablet esta apagada");
        }
        return  res;
    }
    

}
