import java.util.Random;
import java.util.Scanner;;
public class Challenge19_reto9 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        Random result=new Random();
        int x,global,amount,a;
        int random, opc;
        x=1;
        a=0;
        System.out.println("digite la cantidad de dinero con la que cuenta ");
        global=redeye.nextInt();
        System.out.println("digite la cantidad de dinero especifica que desea apostar ");
        amount=redeye.nextInt();
        if (global<1000) {
            System.out.println("no puede apostar mas ");
        }
        do {
        while (x<=1 && global>=1000 && global>=amount) {
            int coin=result.nextInt(2)+1;
            System.out.println(coin);
            System.out.println("¿que saldra cara(2) o sello(1)?");
        random=redeye.nextInt();
        if(random==2&&coin==2){
            System.out.println("Correcto salio cara");
            amount=amount*2;
            a=a+1;
            global=global+amount;
        }
        else if(random==1&&coin==1){
            System.out.println("Correcto salio sello");
            amount=amount*2;
            global=global+amount;
            a=a+1;
        }
        else if(random==1&&coin!=1){
            System.out.println("intentalo de nuevo salio cara");
            global=global-amount;
            a=a+1;
        }
        else if(random==2&&coin!=2){
            System.out.println("intentalo de nuevo salio sello");
            global=global-amount;
            a=a+1;
        }
        else{
            System.out.println("valor No permitido");
        }
        System.out.println("desea volver a jugar digite 1 para si 2 para no?");
        opc=redeye.nextInt();
        if(opc==1){
            System.out.println("de acuerdo...");
        }
        else{
            System.out.println("como desee gano "+a+" y obtuvo en tiene en total "+global);
                x=x+1;
                }    
        }
    } while (x<=1);
        redeye.close();
    }
}
