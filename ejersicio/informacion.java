package ejersicio;

public class informacion {
    public static void main(String[] args){
        Jugador jugador1=new Jugador();
        Jugador jugador2=new Jugador("elrubius", 34,"Noruega",2);
        jugador1.correr();
        jugador1.patear();
        System.out.println("--------------------------------------------------------------------");
        jugador2.correr();
        jugador2.patear();
        jugador2.saltar();
    }
}
