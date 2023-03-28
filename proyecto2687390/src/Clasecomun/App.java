import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner(System.in);
        int numberOne,numberTwo;
        System.out.println("Ingrese un numero");
        numberOne=lectura.nextInt();
        System.out.println("Ingrese otro numero");
        numberTwo=lectura.nextInt();
    System.out.println("El resultado es "+(numberOne+numberTwo)); 
    lectura.nextLine();//limpieza de buffer
    String name;
    System.out.println("Ingrese su nombre ");
    name=lectura.nextLine();
    System.out.println("el nombre ingresado fue "+name); 
    System.out.println("Ingrese los grados fahrenheit");

    System.out.println("Ingrese otro numero");






        lectura.close();
    }
}
