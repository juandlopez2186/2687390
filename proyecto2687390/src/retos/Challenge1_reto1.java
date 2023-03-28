import java.util.Scanner;
public class Challenge1_reto1 {
    public static void main(String[] args) {
        float fahrenheit;
        Scanner lectura=new Scanner(System.in);
        System.out.println("ingrese los grados Fahrenheit");
        fahrenheit=lectura.nextFloat();
        System.out.println("los grados celcius son "+((fahrenheit-32)*5/9));
        lectura.close();
    }
}
