package proyecto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Playlist newPlaylist = new Playlist();
        int opcion;
        String palabra;
        do{
            System.out.println("MENU DE NAVEGACION: \n 1.Agregar Pista \n 2.Eliminar Pista \n 3.Listas Pistas \n 4.Reproducir \n 5.Buscar \n 6.Ordenar \n 7.Salir");
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
                    lector.nextLine();
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
                        default -> System.out.println("Has introducido un valor no valido y por eso no hemos proseguido");
                    }
                }
                case 2 ->{
                    System.out.println("Escriba el titulo a eliminar: ");
                    palabra = lector.nextLine();
                    newPlaylist.eliminarPista(palabra);
                }
                case 3 ->{
                    newPlaylist.listarPistas();
                }
                case 4 ->{
                    System.out.println("Escriba el titulo a reproducir: ");
                    palabra = lector.nextLine();
                    newPlaylist.reproducirPista(palabra);
                }
                case 5 ->{
                    System.out.println("Escriba el titulo a buscar: ");
                    palabra = lector.nextLine();
                    String autor;
                    System.out.println(" Y ahora el autor de dicho titulo: ");
                    autor = lector.nextLine();
                    newPlaylist.buscar(palabra, autor);
                }
                case 6 ->{
                    System.out.println("Selecciona 1.Ordenar por duracion o 2.Ordenar por tipo: ");
                    opcion = lector.nextInt();
                    switch(opcion){
                        case 1->{
                            newPlaylist.ordenarPorDuracion();
                        }
                        case 2 ->{
                            newPlaylist.ordenarPorTipo();
                        }
                        default -> System.out.println("Valor no valido");
                    }
                }
                case 7 ->{
                    System.out.println("Gracias por usar el programa");
                }
                default -> System.out.println("Valor no valido");
            }
        }
        while(opcion!=7);
        lector.close();
    }
}