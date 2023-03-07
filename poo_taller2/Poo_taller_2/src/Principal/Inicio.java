package Principal;
import java.util.Scanner;;
import Health.Person;
public class Inicio {

    Inicio human=new Inicio();
    public static void main(String[] args) { 
        Scanner redeye=new Scanner(System.in);
        System.out.println("digite su tipo de documento");
        typedoc=redeye.nextLine();
        System.out.println("digite su nombre");
        name=redeye.nextLine();
        System.out.println("digite su apellido");
        lastname=redeye.nextLine();
        System.out.println("digite su genero");
        gen=redeye.nextLine();
        System.out.println("digite su numero de documento");
        doc=redeye.nextInt();
        System.out.println("digite su edad");
        age=redeye.nextInt();
        System.out.println("digite su peso");
        weight=redeye.nextInt();
        System.out.println("digite su altura ");
        heigth=redeye.nextInt();
    }
}
