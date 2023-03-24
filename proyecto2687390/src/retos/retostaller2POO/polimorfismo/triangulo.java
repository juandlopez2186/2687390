import java.util.Scanner;
public class triangulo {
    Scanner redeye=new Scanner(System.in);
    public void calculateArea() {
        float alt;
        float base;
        base=0;
        alt=0;
        System.out.println("digite la base");
        base=redeye.nextFloat();
        System.out.println("digite la altura");
        alt=redeye.nextFloat();
        float area=(base*alt)/2;
        System.out.println("La altura del triangulo es "+alt+" , su base "+base+" y el área es "+area);
        
    }
}
