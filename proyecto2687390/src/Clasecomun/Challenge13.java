import java.util.Scanner;
public class Challenge13 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        int men;
        men=0;
        String cant;
        for(int x=1;x<=10;x++){
            System.out.println("digite si es hombre o mujer");
            cant=redeye.nextLine();
            if(cant.equals("hombre")){
                men=men+1;
            }
            else{

            }
        }
        System.out.println("hay "+men+" cantidad de hombres y "+(10-men)+" cantidad de mujeres");
        redeye.close();
    }
}
