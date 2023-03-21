import java.util.Random;
import java.util.Scanner;
public class Challenge16_reto6 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        Random result=new Random();
        int chosse=result.nextInt(6)+1;
        int choss=result.nextInt(6)+1;
        System.out.println("los dados dieron como resultado "+choss+" y "+chosse);
        if(choss==1&&chosse==1){
            System.out.println("par de unos ganaste");
        }
        else if(choss==1&&chosse==2){
            System.out.println("total de tres ganaste");
        }
        else if(choss==2&&chosse==1){
            System.out.println("total de tres ganaste");
        }
        else if(choss==6&&chosse==5){
            System.out.println("total de once ganaste");
        }
        else if(choss==5&&chosse==6){
            System.out.println("total de once ganaste");
        }
        else if(choss==1&&chosse==1){
            System.out.println("total de dos ganaste");
        }
        else if(choss==6&&chosse==6){
            System.out.println("total de doce ganaste");
        }
        else if(choss==5&&chosse==2){
            System.out.println("total de siete ganaste");
        }
        else if(choss==6&&chosse==1){
            System.out.println("total de siete ganaste");
        }
        else if(choss==4&&chosse==3){
            System.out.println("total de siete ganaste");
        }
        else if(choss==3&&chosse==4){
            System.out.println("total de siete ganaste");
        }
        else if(choss==1&&chosse==6){
            System.out.println("total de siete ganaste");
        }
        else if(choss==2&&chosse==5){
            System.out.println("total de siete ganaste");
        }
        else{
            System.out.println("has perdido");
        }
        redeye.close();
  
    }
}
