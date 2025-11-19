package proyecto1;

abstract class Pista {
    protected String titulo, autor;
    protected double duracion; // Duracion en segundos, oyentes mensuales en numero entero
    //Constructores
    public Pista(String titulo, String autor, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    
    }
    //Getter and Setter
        public String getTitulo(){
        return titulo;
    }
    public void SetTitulo(String titulo ){
        this.titulo=titulo;
    }
        public String getAutor(){
        return autor;
    }
    public void SetAutor(String autor){
        this.autor=autor;
    }
        public double getDuracion(){
        return duracion;
    }
    public void SetDuracion(double duracion){
        this.duracion=duracion;
    }
    //Metodos
    public abstract void reproducir();

    
}
