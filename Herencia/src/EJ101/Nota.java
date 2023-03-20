 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ101;

/**
 *
 * @author usuario
 */
public class Nota {
   private String valor;
   private int duracion;
   
   public Nota(String val, int dur){
   this.valor=val;
   this.duracion=dur;
   }
   public String getValor(){
   return valor;
   }
   public int getDuracion(){
       return duracion;
   }
   public String toString(){
   return "["+this.valor+" , "+this.duracion+"]\n";
   }
    
}
