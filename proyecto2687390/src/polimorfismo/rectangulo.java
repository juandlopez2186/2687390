import java.util.Scanner;

public class rectangulo extends Figure{
    Scanner redeye=new Scanner(System.in);
    public void calculateArea() {
        float lado;
        float base;
        base=0;
        lado=0;
        System.out.println("digite la base");
        base=redeye.nextFloat();
        System.out.println("digite el lado");
        lado=redeye.nextFloat();
        float area=base*lado;
        System.out.println("El lado del rectangulo es "+lado+" el área es"+area);
        
    }
}
