package proyecto1;

public class Cancion extends Pista {
    public Cancion(String titulo, String autor, int duracion, int oyentes_mensuales) {
        super(titulo, autor, duracion, oyentes_mensuales);
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.oyentes_mensuales = oyentes_mensuales;
    }
    @Override
    public String toString(){
        return "Cancion: " + titulo + " Autor: " + autor + " Duracion: " + duracion + " Oyentes mensuales: " + oyentes_mensuales;
    }

}
