import java.util.Random;
import java.util.Scanner;
public class Challenge15_reto4 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        Random result=new Random();
        int chosse=result.nextInt(3)+1;
        int random;
        System.out.println("¿piedra(1),papel(2) o tijera(3)?");
        random=redeye.nextInt();
        if(random==1&&chosse==1){
            System.out.println("piedra vs piedra empate");
        }
        else if(random==1&&chosse!=2){
            System.out.println("piedra vs papel pierdes");
        }
        else if(random==1&&chosse!=3){
            System.out.println("piedra vs tijetas ganas");
        }
        else if(random==2&&chosse==1){
            System.out.println("papel vs piedra ganaste");
        }
        else if(random==2&&chosse!=2){
            System.out.println("papel vs papel empate");
        }
        else if(random==2&&chosse!=3){
            System.out.println("papel vs tijeras perdiste");
        }
        else if(random==3&&chosse==1){
            System.out.println("tijeras vs piedra perdiste");
        }
        else if(random==3&&chosse!=2){
            System.out.println("tijeras vs papel ganaste");
        }
        else if(random==3&&chosse!=3){
            System.out.println("tijeras vs tijeras empate");
        }
        else{
            System.out.println("valor No permitido");
        }
        redeye.close();
  
    }
}
