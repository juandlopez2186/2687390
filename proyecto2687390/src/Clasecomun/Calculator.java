import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {   
    Scanner redeye=new Scanner(System.in);
    double num1,num2,op;
    int opc;
    System.out.println("digite un numero");
    num1=redeye.nextInt();
    System.out.println("digite un segundo numero");
    num2=redeye.nextInt();
    System.out.println("digite el numero consecuente a la operacion "+"1 suma "+"2 resta "+"3 multiplicacion "+"4 division "+"5 potencia "+"6 raiz cuadrada ");
    opc=redeye.nextInt();
    switch (opc) {
        case 1:
        op=num1+num2;
            System.out.println("a seleccionado suma, el resultado de la operacion entre "+num1+" y "+num2+" es "+op);
            break;
            case 2:
            op=num1-num2;
            System.out.println("a seleccionado Resta, el resultado de la operacion entre "+num1+" y "+num2+" es "+op);
            break;
            case 3:
            op=num1*num2;
            System.out.println("a seleccionado Multiplicacion, el resultado de la operacion entre "+num1+" y "+num2+" es "+op);
            break;
            case 4:
            op=num1/num2;
            System.out.println("a seleccionado Division, el resultado de la operacion entre "+num1+" y "+num2+" es "+op);
            break;
            case 5:
            op=Math.pow(num1,num2);
            System.out.println("a seleccionado Potencia, el resultado de la operacion entre "+num1+" y "+num2+" es "+op);
            break;
            case 6:
            op=Math.sqrt(num1);
            double po;
            po=Math.sqrt(num2);
            System.out.println("a seleccionado Raiz cuadrada, el resultado de la raiz de los numeros "+num1+" y "+num2+" es "+op+" y "+po);
            break;
        default:
        System.out.println("error");
            break;
    }
    redeye.close();
}
}
