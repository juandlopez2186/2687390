import java.util.Scanner;
public class Challenge10 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        int cost;
        String color;
        System.out.println("ingrese el precio de la compra ");
        cost=redeye.nextInt();
        if(cost>50000){
            System.out.println("digite el color de la balota");
            color=redeye.nextLine();
            switch(color){
                case "azul":
                break;
            }

        }
    }
}
