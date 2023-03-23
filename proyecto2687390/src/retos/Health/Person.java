package Health;
import java.util.Scanner;
public class Person {
static Scanner redeye=new Scanner (System.in);
   private String typeDoc;
   private int doc;
   private String name;
   private String lastname;
   private double weigth;
   private double heigth;
   private int age;
   private double weigthHeigth;
   private double actualWeight;
   private String gender;
   public void pedirDatos(){
    System.out.println("Ingrese el nombre de la persona");
    name=redeye.nextLine();
    System.out.println("Ingrese el apellido de la persona");
    lastname=redeye.nextLine();
    System.out.println("Ingrese la edad de la persona");
    age=redeye.nextInt();
    if (age<=0){
        System.out.println("la edad no puede ser menor o igual a cero por favor digite la edad de nuevo");
        age=redeye.nextInt();
    }
    redeye.nextLine();
    System.out.println("Ingrese el tipo de documento de la persona");
    typeDoc=redeye.nextLine();
    if (age<18 && typeDoc.equals("cedula")){
        System.out.println("Usted no puede tener cedula ingrese por favor su tipo de documento");
        typeDoc=redeye.nextLine();
    }
    System.out.println("Ingrese el numero de documento de la persona");
    doc=redeye.nextInt();
    System.out.println("Ingrese la estatura de la persona en metros");
    heigth=redeye.nextDouble();
    System.out.println("Ingrese el peso de la persona en kilogramos");
    weigth=redeye.nextDouble();
    redeye.nextLine();
    System.out.println("Ingrese el sexo de la persona");
    gender=redeye.nextLine();
   }
   public void mostrarPersona(){
    System.out.println("La persona registrada con el nombre "+name+" "+lastname+" tiene:");
    System.out.println("Una edad de: "+age);
    System.out.println("Su tipo de documento es: "+typeDoc);
    System.out.println("Su numero de documento es: "+doc);
    System.out.println("Su peso es: " +weigth);
    System.out.println("Su estatura es: "+heigth);
    System.out.println("y su sexo es: "+gender);
   }
   public Double calcularlmc(){
    weigthHeigth=Math.pow (heigth,2);
    actualWeight=weigth/weigthHeigth;
    if (actualWeight<20.0){
        System.out.println("Su peso es: "+actualWeight+" el peso está por debajo de lo ideal");
    }
    else if (actualWeight>=20.0 && actualWeight<=25.0){
        System.out.println("Su peso es: "+actualWeight+" el peso es ideal");
    }
    else if (actualWeight>25.0){
      System.out.println("Su peso es: "+actualWeight+" tiene sobre peso");
    }
    return actualWeight;
   }
   public void mayoredad(){
    if (age<18){
      System.out.println("Es menor de edad al tener "+age+" años");
    }
    else if (age>=18){
        System.out.println("Es mayor de edad al tener "+age+" años");
    }
   }
}

