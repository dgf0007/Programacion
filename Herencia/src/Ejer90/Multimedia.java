/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer90;

/**
 *
 * @author usuario
 */
public class Multimedia {
     String titulo;
     String formato;
     int duracion;
    
    
    
    public Multimedia(String titulo, String formato, int duracion) {
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
        
        //Comprobar los formatos
        
        switch (formato) {
            case "wav":
                case "aac":
                    case "mp4:":
                        case "mk4":
                            case "mov":
                                case "flv":
                break;
            default:
            case "mp3":
        }
    }
    
    public String toString() {
        String res = "";
        res += "\n El título de multimedia es " +this.titulo;
        res += "\n El formato de multimedia es " +this.formato;
        res += "\n La duración del multimedia es  " +this.duracion;
        return res;
    }
    
    public boolean equals(String formatoUser, int duracionUser) {
        if (this.formato.equalsIgnoreCase(formatoUser) && this.duracion == duracionUser) {
            return true;
        }
        else {
            return false;
        }
    }
}
