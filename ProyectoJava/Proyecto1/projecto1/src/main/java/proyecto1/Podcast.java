package proyecto1;

public class Podcast extends Pista {
    private String invitado;
    public Podcast(){
        super("","",0);
        this.invitado = "";
    }
    public String getInvitado(){
        return invitado;
    }
    public void SetInvitado(String invitado){
        this.invitado=invitado;
    }
    @Override
    public String toString(){
        return "Podcast: " + titulo + " Autor: " + autor + " Duracion: " + duracion + " Invitado: " + invitado;
    }
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo: " + titulo + " ---> " + "( " +  duracion + " segundos )" + " de " + autor + " y como invitado " + invitado);
    }
    @Override
    public String getTipo(){
        return "Podcast";
    }
}
