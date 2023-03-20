package Ejer90;

/* @author usuario*/
public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actorSecuandario;

    public Pelicula(String actorPrincipal, String actorSecundario, String titulo, String formato, int duracion) {
        super(titulo, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actorSecuandario = actorSecundario;
    }

    public String getActorPrincipal() {
        return this.actorPrincipal;
    }
    
    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActorSecundario() {
        return this.actorSecuandario;
    }

    @Override
    public String toString() {
        String res = "";
        res += "\n El actor principal se llama " + this.actorPrincipal;
        res += "\n El actor secundario se llama " + this.actorSecuandario;
        res += "\n El título de multimedia es " +this.titulo;
        res += "\n El formato de multimedia es " +this.formato;
        res += "\n La duración del multimedia es  " +this.duracion;
        return res;
    }
    
    public boolean equals(String actorPrinUser, String actorSecUser) {
        if (this.actorPrincipal.equalsIgnoreCase(actorPrinUser)&& (this.actorSecuandario.equalsIgnoreCase(actorSecUser))) {
            return true;
        }
        else {
            return false;
        }
    }
}
