package taller2;
import java.util.Scanner;
public class animal {
    private String nombre;
    public int edad; 
//constructor por defecto los dos deben ir juntos   
    public animal(){}
//constructor 
public animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;

}
animal tigre=new animal();
Scanner redeye=new Scanner(System.in);
public void addAnimal(String nombre,int edad) {
    System.out.println("ingrese el nombre del animal");
    nombre=redeye.nextLine();
    System.out.println("ingrese la edad del animal");
    edad=redeye.nextInt();
}    
public void showAnimal() {
    System.out.println("el nombre del animal ingresado es "+nombre+"y su edad es"+edad);
}
}

