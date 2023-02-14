import java.util.Random;
import java.util.Scanner;
public class Challenge7 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        Random result=new Random();
        int coin=result.nextInt(2)+1;
        int random;
        System.out.println("¿que saldra cara(1) o sello(2)?");
        random=redeye.nextInt();
        if(random==coin){
            System.out.println("Correcto"+coin);
        }
        else{
            System.out.println("Intente de nuevo"+coin);;
        }
        redeye.close();
    }
}
