package proyecto1;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Pista> listaPistas = new ArrayList<>();

    public void agregarPista(Pista a){
        listaPistas.add(a);
    }
    public void listarPistas(){
        for(Pista i: listaPistas){
            System.out.println(i);
        }
    }
    public void reproducirPista(String titulo){
        for(Pista i: listaPistas){
            if(titulo.equalsIgnoreCase(i.getTitulo())){
                i.reproducir();
                return;
            }
        }
        System.out.println("Pista no encontrada");
    }
    public double duracionTotal(){
        double total = 0;
        for(Pista i:listaPistas){
            total+=i.getDuracion();
        }
        return total;
    }
    public boolean eliminarPista(String titulo){
        for(Pista i: listaPistas){
            if(titulo.equalsIgnoreCase(i.getTitulo())){
                listaPistas.remove(i);
                System.out.println("Eliminado con exito");
                return true;
            }
        }
        System.out.println("No se pudo eliminar");
        return false;
    }
    public void buscar(String titulo, String autor){
        boolean encontrado = false;
        for(Pista i: listaPistas){
            if(titulo.equalsIgnoreCase(i.getTitulo()) && autor.equalsIgnoreCase(i.getAutor())){
                System.out.println("Se encontro la Pista ");
                System.out.println(i);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
                System.out.println("No se encontro la Pista");
            }
    }
}
