import java.util.Scanner;
public class eje {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        carasello ac=new carasello();
        pipayti acc=new pipayti();
        int op;
        System.out.println("digite 1 si quiere jugar cara y sello o 2 si quiere jugar piedra papel o tijera");
        op=redeye.nextInt();
        if (op==1) {
        ac.inicio();
        ac.jugar();
        ac.finalizar();
        } else if (op==2) {
            acc.inicio();
            acc.jugar();
            acc.finalizar();
        } else {
            System.out.println("valor no permitido");
        }
        redeye.close();
    }
}
