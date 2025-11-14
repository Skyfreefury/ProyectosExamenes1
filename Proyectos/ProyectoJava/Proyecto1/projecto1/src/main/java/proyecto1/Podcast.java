package proyecto1;

public class Podcast extends Pista {
    public Podcast(String titulo, String autor, int duracion, int oyentes_mensuales) {
        super(titulo, autor, duracion, oyentes_mensuales);
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.oyentes_mensuales = oyentes_mensuales;
    }
    @Override
    public String toString(){
        return "Podcast: " + titulo + " Autor: " + autor + " Duracion: " + duracion + " Oyentes mensuales: " + oyentes_mensuales;
    }
}
