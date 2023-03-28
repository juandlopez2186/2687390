import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
         int cost,cant,cont,sub,acum,pago,cam;
         String con;
         cont=0;
         acum=0;
        for(int x=1;x<=5;x++){
            System.out.println("digite el precio del producto");
        cost=redeye.nextInt();
            System.out.println("digite la cantidad de productos");
            cant=redeye.nextInt();
        cont=cont+1;
        sub=cost*cant;
        acum=acum+sub;
        }
        System.out.println("el total es "+acum);
        System.out.println("digite la cantidad que cancela");
        pago=redeye.nextInt();
        cam=pago-acum;
        System.out.println("el cambio es de "+cam);
        redeye.nextLine();
        System.out.println("cuenta con telefonia movil exito?");
        con=redeye.nextLine();
        if(con.equals("si")){
            System.out.println("obtuvo "+cont+" minuto(s) con su compra");
        }
        else{
            System.out.println("adquiera ya tu telefonia movil exito");
        }
        redeye.close();
    }
}
