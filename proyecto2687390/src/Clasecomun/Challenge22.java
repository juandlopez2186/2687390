import java.util.Scanner;
public class Challenge22 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        double por,prom;
        int p;
        System.out.println("digite la cantidad de notas");
        p=redeye.nextInt();
        int []vector=new int[p];
        for(int x=0;x<vector.length;x++){
        System.out.println("digite la nota No "+x);
        vector[x]=redeye.nextInt();
        }
        prom=vector[p]+vector[p]/p;
        System.out.println("Digite el porcentaje de asistencias");
        por=redeye.nextDouble();
        if( por>=70 && prom<35){
            System.out.println("su promedio de notas fue "+prom+" por ende aprobo");
        }
        else{
            System.out.println("su promedio de notas fue "+prom+" por ende reprobo");
        }
        redeye.close();
    }
    }