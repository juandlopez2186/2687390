
package clase1;
import java.util.Scanner;
public class Animal {
    public int age;
    private String name;
    Animal tigre=new Animal();
    Scanner redeye=new Scanner(System.in);
    public void addAnimal(String name,int age) {
        System.out.println("ingrese el nombre del animal");
        name=redeye.nextLine();
        System.out.println("ingrese la edad del animal");
        age=redeye.nextInt();
    }    
    public void showAnimal() {
        System.out.println("el nombre del animal ingresado es "+name+"y su edad es"+age);
    }
}