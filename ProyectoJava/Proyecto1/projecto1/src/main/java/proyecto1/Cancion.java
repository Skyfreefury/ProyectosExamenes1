package proyecto1;

public class Cancion extends Pista {
    private String genero;

    // Constructor por defecto
    public Cancion() {
        super("", "", 0);
        this.genero = "";
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Constructor con parámetros
    public Cancion(String titulo, String autor, int duracion, String genero) {
        super(titulo, autor, duracion);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cancion: " + titulo + " Autor: " + autor + " Duracion: " + duracion + " Genero: " + genero ;
    }
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo: " + titulo + " ---> " + "( " +  duracion + " segundos )" + " de " + autor + " y genero " + genero);
    }
}
