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
    public void ordenarPorDuracion(){
        int num = listaPistas.size();
        boolean cambio;
        for(int i=0; i<num-1;i++){
            cambio = false;
            for(int j =0; j<num-1-i;j++){
                if(listaPistas.get(j).getDuracion()>listaPistas.get(j+1).getDuracion()){
                    Pista temp = listaPistas.get(j);
                    listaPistas.set(j, listaPistas.get(j+1));
                    listaPistas.set(j+1, temp);
                    cambio = true;
                }
            }
            if(!cambio){
                break;
            }
        }
        System.out.println("Pistas ordenadas por duracion: ");
        listarPistas();
    }
    public void ordenarPorTipo(){
        int num =listaPistas.size();
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if (listaPistas.get(j).getTipo().compareToIgnoreCase(listaPistas.get(j + 1).getTipo()) > 0) {
                    Pista temp = listaPistas.get(j);
                    listaPistas.set(j, listaPistas.get(j + 1));
                    listaPistas.set(j + 1, temp);
                }
            }
        }
        System.out.println("Pistas ordenadas por tipo: ");
        listarPistas();
    }
}
