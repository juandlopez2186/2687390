import java.util.Scanner;
public class Challenge4 {
   public static void main(String[] args) {
    Scanner lectura=new Scanner(System.in);
    int age;
System.out.println("ingrese su edad");
age=lectura.nextInt();
if (age>=18){
System.out.print("es mayor de edad,Bienvenido");
}
else if(age>0){
    System.out.println("no es mayor de edad,acceso denegado");
}
else{
System.out.println("nisisquiera a nacido");
}
lectura.close();
   } 
}
