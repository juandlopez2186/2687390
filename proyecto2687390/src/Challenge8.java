import java.util.Scanner;
public class Challenge8 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        Double por,n1,n2,n3,prom;
        System.out.println("Digite La primera nota");
        n1=redeye.nextDouble();
        System.out.println("Digite La segunda nota");
        n2=redeye.nextDouble();
        System.out.println("Digite La tercera nota");
        n3=redeye.nextDouble();
        prom=(n1+n2+n3)/3;
        System.out.println("Digite el porcentaje de asistencias");
        por=redeye.nextDouble();
        if(prom>=3.5 && por>=70){
            System.out.println("aprobo");
        }
        else{
            System.out.println("reprobo");
        }
        redeye.close();
        }
    }

