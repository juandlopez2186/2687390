import java.util.Scanner;
public class pipayti implements juego{
    Scanner redeye=new Scanner(System.in);
    private String nombre;
    private int random;
    @Override
    public void inicio(){
        System.out.println("ingrese su nombre");
        nombre=redeye.nextLine();
    }
    public void jugar() {
        int chosse=(int)(Math.random()*3+1);
        System.out.println("elija (1)piedra (2)papel (3)tijera ");
        random=redeye.nextInt();
        if(random==1&&chosse==1){
            System.out.println(nombre+" piedra vs piedra empate");
        }
        else if(random==1&&chosse!=2){
            System.out.println(nombre+" piedra vs papel pierdes");
        }
        else if(random==1&&chosse!=3){
            System.out.println(nombre+" piedra vs tijetas ganas");
        }
        else if(random==2&&chosse==1){
            System.out.println(nombre+" papel vs piedra ganaste");
        }
        else if(random==2&&chosse!=2){
            System.out.println(nombre+" papel vs papel empate");
        }
        else if(random==2&&chosse!=3){
            System.out.println(nombre+" papel vs tijeras perdiste");
        }
        else if(random==3&&chosse==1){
            System.out.println(nombre+" tijeras vs piedra perdiste");
        }
        else if(random==3&&chosse!=2){
            System.out.println(nombre+" tijeras vs papel ganaste");
        }
        else if(random==3&&chosse!=3){
            System.out.println(nombre+" tijeras vs tijeras empate");
        }
        else{
            System.out.println("valor No permitido");
        }
    }
    public void finalizar() {
        
    }
}
