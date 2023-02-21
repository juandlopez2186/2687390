import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
         int cost,cant;
        for(int x=1;x<=5;x++){
            System.out.println("digite el precio del producto");
        cost=redeye.nextInt();
            System.out.println("digite la cantidad de productos");
            cant=redeye.nextInt();
        }
        redeye.close();
    }
}
