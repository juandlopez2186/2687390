import java.util.Scanner;
public class Challenge3 {
    public static void main(String[] args) {
        int cant,cash,fin,total;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite la cantidad de productos: ");
        cant=lectura.nextInt();
        cash=cant*10000;
        System.out.println("la cantidad a pagar es: "+cash);
        System.out.println("Digite la cantidad de dinero que cancela: ");
        total=lectura.nextInt();
        fin=total-cash;
        System.out.println("El cambio a dar es: "+fin);
        lectura.close();
    }
}
