package proyecto1;

abstract  class Pista {
    protected String titulo, autor;
    protected int duracion, oyentes_mensuales; // Duracion en segundos, oyentes mensuales en numero entero

    public Pista(String titulo, String autor, int duracion, int oyentes_mensuales) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.oyentes_mensuales = oyentes_mensuales;
    }
    public void reproducir(){
        System.out.println("Reproduciendo: " + titulo + " ---> " + "( " +  duracion + " segundos )" + " de " + autor);
    }
}
