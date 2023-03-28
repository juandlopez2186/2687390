import java.util.Random;
import java.util.Scanner;
public class Challenge18_reto8 {
public static void main(String[] args) {
    Scanner redeye=new Scanner(System.in);
    Random r=new Random();
    int ra=r.nextInt(4)+1;
    int cost,pop,a,limit,s;
    a=0;
    System.out.println("digite la cantidad de productos a digitar");
    limit=redeye.nextInt();
    for(int x=0;x<limit;x++){
    System.out.println("registre la cantidad del producto");
    pop=redeye.nextInt();
    System.out.println("ingrese el precio de la compra ");
    cost=redeye.nextInt();
    cost=cost*pop;
    a=cost+a;
    System.out.println("el total es de "+a);
    if(cost>50000 && x>=limit){
        redeye.nextLine();
        switch(ra){
            case 1:
            s=(cost*10)/100;
            cost=cost-s;
            System.out.println("felicidades a ganado un descuento de 10% en su compra dando como resultado "+cost);
            a=cost+a;
            break;
            case 2:
            s=(cost*30)/100;
            cost=cost-s;
            System.out.println("felicidades a ganado un descuento de 30% en su compra dando como resultado "+cost);
            a=cost+a;
            break;
            case 3:
            s=(cost*50)/100;
            cost=cost-s;
            System.out.println("felicidades a ganado un descuento de 50% en su compra dando como resultado "+cost);
            a=cost+a;
            break;
            case 4:
            cost=cost-cost;
            System.out.println("felicidades a ganado una compra completamente gratis ");
            break;
            
        }

    }
    else{
       
    }
    }
redeye.close();
}
}
