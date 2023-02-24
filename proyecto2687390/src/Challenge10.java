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
                case "rojo":
                cost=(cost*10)/100;
                System.out.println("felicidades a ganado un descuento de 10% en su compra dando como resultado "+cost);
                break;
                case "azul":
                cost=(cost*30)/100;
                System.out.println("felicidades a ganado un descuento de 30% en su compra dando como resultado "+cost);
                break;
                case "amarillo":
                cost=(cost*50)/100;
                System.out.println("felicidades a ganado un descuento de 50% en su compra dando como resultado "+cost);
                break;
                case "blanco":
                System.out.println("felicidades a ganado una compra completamente gratis ");
                break;
            }

        }
    redeye.close();
    }
}
