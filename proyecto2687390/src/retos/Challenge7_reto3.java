import java.util.Random;
import java.util.Scanner;
public class Challenge7_reto3 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        Random result=new Random();
        int coin=result.nextInt(2)+1;
        int random;
        System.out.println("¿que saldra cara(0) o sello(1)?");
        random=redeye.nextInt();
        if(random==0&&coin==0){
            System.out.println("Correcto salio cara");
        }
        else if(random==1&&coin==1){
            System.out.println("Correcto salio sello");
        }
        else if(random==1&&coin!=0){
            System.out.println("intentalo de nuevo salio cara");
        }
        else if(random==0&&coin!=1){
            System.out.println("intentalo de nuevo salio sello");
        }
        else{
            System.out.println("valor No permitido");
        }
        redeye.close();
    }
}
