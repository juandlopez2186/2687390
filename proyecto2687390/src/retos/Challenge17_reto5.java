import java.util.Scanner;
public class Challenge17_reto5 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        String name,lastname,complete;
        System.out.println("digite su nombre");
        name=redeye.nextLine();
        System.out.println("digite su apellido");
        lastname=redeye.nextLine();
        System.out.println("cantidad de letras de su nombre: "+name.length());
        System.out.println("cantidad de letras de su apellido: "+lastname.length());
        System.out.println("su nombre en mayusculas: "+name.toUpperCase());
        System.err.println("su apellido en minusculas: "+lastname.toLowerCase());
        complete=name+lastname;
        System.out.println("su nombre completo es "+complete);
        System.out.println(name.substring(0, 2)+lastname);
        redeye.close();
    }
}
