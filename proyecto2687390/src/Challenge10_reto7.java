import java.util.Random;
import java.util.Scanner;
public class Challenge10_reto7 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        Random r=new Random();
        int ra=r.nextInt(3)+1;
        int cost;
        System.out.println("ingrese el precio de la compra ");
        cost=redeye.nextInt();
        if(cost>50000){
            redeye.nextLine();
            switch(ra){
                case 1:
                cost=(cost*10)/100;
                System.out.println("felicidades a ganado un descuento de 10% en su compra dando como resultado "+cost);
                break;
                case 2:
                cost=(cost*30)/100;
                System.out.println("felicidades a ganado un descuento de 30% en su compra dando como resultado "+cost);
                break;
                case 3:
                cost=(cost*50)/100;
                System.out.println("felicidades a ganado un descuento de 50% en su compra dando como resultado "+cost);
                break;
                case 4:
                System.out.println("felicidades a ganado una compra completamente gratis ");
                break;
            }

        }
    redeye.close();
    }
}
