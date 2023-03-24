import java.util.Scanner;
public class ece {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        int id;
        Square e1=new Square();
        rectangulo e2=new rectangulo();
        circulo e3=new circulo();
        triangulo e4=new triangulo();
        int op=1;
        while (op==1) {
            System.out.println("digite que area quiere calcular 1 para cuadrado, dos para rectangulo, tres para circulo, cuatro para triangulo");
            id=redeye.nextInt();
            switch (id) {
                case 1:
                    e1.calculateArea();
                    break;
                case 2:
                    e2.calculateArea();
                    break;
                case 3:
                    e3.calculateArea();
                    break;
                case 4:
                    e4.calculateArea();
                    break;
                default:
                System.out.println("opcion no disponible ");
                    break;
            }
            System.out.println("desea continuar? 1si ,2 no ");
            op=redeye.nextInt();
            if (op!=1) {
            System.out.println("finalizacion del programa");
            }
        }
        redeye.close();
    }
}
