package Health;
import java.util.Scanner;;
public class Person {
    Scanner redeye=new Scanner(System.in);
    public int doc,age,heigth,weight;
    public String typedoc,name,lastname,gen;
public void getdata() {
    System.out.println("digite su tipo de documento");
    typedoc=redeye.nextLine();
    System.out.println("digite su nombre");
    name=redeye.nextLine();
    System.out.println("digite su apellido");
    lastname=redeye.nextLine();
    System.out.println("digite su genero");
    gen=redeye.nextLine();
    System.out.println("digite su numero de documento");
    doc=redeye.nextInt();
    System.out.println("digite su edad");
    age=redeye.nextInt();
    System.out.println("digite su peso");
    weight=redeye.nextInt();
    System.out.println("digite su altura ");
    heigth=redeye.nextInt();
}
public void showperson() {
    System.out.println("datos de la persona");
    System.out.println("tipo de documento: "+typedoc);
    System.out.println("nombre: "+name);
    System.out.println("apellido: "+lastname);
    System.out.println("genero: "+gen);
    System.out.println("numero de documento: "+doc);
    System.out.println("edad: "+age);
    System.out.println("peso: "+weight);
    System.out.println("altura: "+heigth);
}
public void calcularingmc() {
    float actualweight;
    actualweight=weight/(heigth)^2;
    if (actualweight>=25) {
        System.out.println("tiene sobre peso");
    }
    else if (actualweight<=25 || actualweight>=20) {
        System.out.println("el peso es ideal");
        }
    else {
        System.out.println("el peso esta debajo del ideal");
    }
    
}
public void highage() {
    if (age>=18) {
        System.out.println("es mayor de edad");
    }
    else
    {
        System.out.println("no es mayor de edad");
    }
}
}