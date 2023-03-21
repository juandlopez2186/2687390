import java.util.Scanner;

public class Square extends Figure {
    Scanner redeye=new Scanner(System.in);
    public void calculateArea() {
        float lado;
        lado=0;
        System.out.println("digite el lado");
        lado=redeye.nextFloat();
        float area=lado*lado;
        System.out.println("El lado del cuadrado es "+lado+" el área es"+area);
        
    }
}
    