package proyecto1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Playlist newPlaylist = new Playlist();
        int opcion;
        String palabra;
        do{
            System.out.println("MENU DE NAVEGACION: 1.Agregar Pista \n 2.Eliminar Pista \n 3.Listas Pistas \n 4.Reproducir \n 5.Buscar \n 7.Ordenar \n 8.Salir");
            opcion = lector.nextInt();
            lector.nextLine();
            switch (opcion) {
                case 1 ->{
                    String titulo, autor;
                    double duracion;
                    System.out.println("Seleccione: \n 1.Agregar Cancion \n 2.Agregar Audio Libro \n 3.Agregar Podcast \n");
                    int tipo = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese el titulo: ");
                    titulo = lector.nextLine();
                    System.out.println("Ingrese el autor: ");
                    autor = lector.nextLine();
                    System.out.println("Ingrese la duracion en segundos: ");
                    duracion = lector.nextDouble();
                    switch(tipo){
                        case 1 ->{
                            String genero;
                            System.out.println("Y por ultimo el genero: ");
                            genero = lector.nextLine();
                            Cancion newCancion = new Cancion();
                            newCancion.SetTitulo(titulo);
                            newCancion.SetAutor(autor);
                            newCancion.SetDuracion(duracion);
                            newCancion.setGenero(genero);
                            newPlaylist.agregarPista(newCancion);
                            System.out.println("Cancion Agregada Correctamente");
                        }
                        case 2 ->{
                            String narrador;
                            System.out.println("Y por ultimo el narrador: ");
                            narrador = lector.nextLine();
                            AudioLibro newAudioLibro = new AudioLibro();
                            newAudioLibro.SetTitulo(titulo);
                            newAudioLibro.SetAutor(autor);
                            newAudioLibro.SetDuracion(duracion);
                            newAudioLibro.setNarrador(narrador);
                            newPlaylist.agregarPista(newAudioLibro);
                            System.out.println("Audio Libra Agregado Correctamente");
                        }
                        case 3 -> {
                            String invitado;
                            System.out.println("Y por ultimo el invitado: ");
                            invitado = lector.nextLine();
                            Podcast newPodcast = new Podcast();
                            newPodcast.SetTitulo(titulo);
                            newPodcast.SetAutor(autor);
                            newPodcast.SetDuracion(duracion);
                            newPodcast.SetInvitado(invitado);
                            newPlaylist.agregarPista(newPodcast);
                            System.out.println("Audio Libro Agregado Correctamente");
                        }
                        default -> System.out.println("Introduce un valor valido");
                    }
                }
                default -> System.out.println("Valor no valido");
            }
        }
        while(opcion!=8);
    }
    
}