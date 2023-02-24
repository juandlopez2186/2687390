import java.util.Scanner;
public class Challenge11_reto2 {
    public static void main(String[] args) {
        int month;
        double weight,dosis;
        Scanner redeye=new Scanner(System.in);
        System.out.println("digite el peso(kg) y lod meses de el recien nacido");
        weight=redeye.nextDouble();
        month=redeye.nextInt();
        dosis=((weight+10)/(month*10))*8;
        System.out.println("la dosis es de "+dosis);
        redeye.close();
    }
}