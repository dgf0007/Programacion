/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer90;

/**
 *
 * @author usuario
 */
public class Cancion extends Multimedia{
    private String artista;
    private String editor;
    private String genero;
    
    public Cancion(String artista, String editor, String genero, String titulo, String formato, int duracion) {
        super(titulo, formato, duracion);
        this.artista = artista;
        this.editor = editor;
        this.genero = genero;
        
        switch (genero) {
            case "pop":
                    case "flamenco":
                        case "hiphop":
                            case "R&B":
                                case "reggeaton":
                break;
            default:
            case "rock":
        }
        
        
    }
    
    public String getArtista() {
        return this.artista;
    }
    
    public String getEditor() {
        return this.editor;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    // Falta actor Principal y actorSecundario
    
    public String toString() {
        String res = "";
        res += "\nEl artista se llama " + this.artista;
        res += "\n El editor se llama " +this.editor;
        res += "\n El género es " +this.genero;
        res += "\n El título de multimedia es " +this.titulo;
        res += "\n El formato de multimedia es " +this.formato;
        res += "\n La duración del multimedia es  " +this.duracion;
        return res;
    }
}
