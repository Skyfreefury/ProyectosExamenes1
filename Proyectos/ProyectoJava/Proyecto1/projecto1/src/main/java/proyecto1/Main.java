package proyecto1;

public class Main {
    public static void main(String[] args) {
        Podcast pod = new Podcast("Podcast de Java", "Juan Perez", 3600, 5000);
        Cancion can = new Cancion("Cancion de Rock", "Rock Band", 240, 20000);
        AudioLibro book = new AudioLibro("Aprendiendo Java", "Maria Lopez", 7200, 8000);
        pod.reproducir();
        can.reproducir();
        book.reproducir();
    }
    
}