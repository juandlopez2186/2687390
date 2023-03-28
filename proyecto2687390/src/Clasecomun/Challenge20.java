import java.util.Scanner;
public class Challenge20 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        int number, op=0 ;
        do {
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
    System.out.println("si desea continuar presione 1 si no presione 2");
    op=redeye.nextInt();
}
     while (op==1);
    redeye.close();
}
}
