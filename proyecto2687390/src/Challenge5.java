import java.util.Scanner;
public class Challenge5 {
    public static void main(String[] args) {
    Scanner redeye=new Scanner(System.in);
    int numberOne,numberTwo;
    System.out.println("ingrese un numero");
    numberOne=redeye.nextInt();
    System.out.println("Ingrese un segundo numero");
    numberTwo=redeye.nextInt();
    if(numberOne>numberTwo){
        System.out.println("el resultado es"+(numberOne+numberTwo));
    }
    else{
        System.out.println("el resultado es"+(numberOne-numberTwo));
    }
    redeye.close();    
}
    
}
