import java.util.Scanner;
public class Challenge6 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        int number;
        System.out.println("ingrese un numero");
        number=redeye.nextInt();
        if(number<0){
            System.out.println("el numero "+number+" es negativo");
        }
        else if(number>0){
            System.out.println("el numero "+number+" es positivo");
        }
        else{
            System.out.println("el numero "+number+" es neutro");
        }
        redeye.close();
    }
}
