import java.util.Scanner;

public class circulo extends Figure{
    Scanner redeye=new Scanner(System.in);    
    public void calculateArea() {
            float rad;
            rad=0;
            System.out.println("digite el radio");
            rad=redeye.nextFloat();
            double area=3.14*(rad*2);
            System.out.println("El lado del rectangulo es "+rad+" el área es"+area);
            
        }
    }
