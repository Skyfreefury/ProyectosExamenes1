package proyecto1;

public class AudioLibro extends Pista {
    private String narrador;
    public AudioLibro(){
        super("", "", 0);
        this.narrador = "";
    }
    public String getNarrador() {
        return narrador;
    }
    public void setNarrador(String narrador){
        this.narrador=narrador;
    }
    @Override
    public String toString(){
        return "AudioLibro: " + titulo + " Autor: " + autor + " Duracion: " + duracion + " y Narrador: " + narrador;
    }
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo: " + titulo + " ---> " + "( " +  duracion + " segundos )" + " de " + autor + " y narrador " + narrador);
    }
    @Override
    public String getTipo(){
        return "AudioLibro";
    }
}
