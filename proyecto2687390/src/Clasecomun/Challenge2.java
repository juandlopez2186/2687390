import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args) {
        Double width,height,area;
        Scanner lectura=new Scanner(System.in);
        System.out.println("digite el ancho");
        width=lectura.nextDouble();
        System.out.println("digite la altura");
        height=lectura.nextDouble();
        area=width*height;
        System.out.println("la superficie a cubrir tiene :"+width+" metros de ancho por "+height+" metros cuadrados. El presupuesto es "+area*45000);
        lectura.close();
   }
}
