package ejersicio;
//Una claase Jugador que tiene 3 atributos(avatar, edad, pais)el jugador 1 datos quemadossolo tiene metodos para "patear y correr"y el jugador 2 "patear correr y saltar" desde el objeto
public class Jugador {
    String avatar;
    int edad;
    String pais;
    public Jugador(String avatar, int edad, String pais){
        this.avatar=avatar;
        this.edad=edad;
        this.pais=pais;
    }
    public Jugador(){
        this.avatar="Juegagerman";
        this.edad=34;
        this.pais="Chile";
    }
    public void patear(){
        System.out.println("El gamer: "+avatar+" de edad: "+edad+" que nacio en el pais de "+pais+ " va a patear");
    }
    public void correr(){
        System.out.println("El gamer: "+avatar+" de edad: "+edad+" que nacio en el pais de "+pais+ " va a correr");
    }
    public  void saltar(){
        System.out.println("El gamer: "+avatar+" de edad: "+edad+" que nacio en el pais de "+pais+ " va a saltar");
    }
}
