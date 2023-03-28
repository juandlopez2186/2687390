import java.util.Scanner;

public class carasello implements juego {
    Scanner redeye=new Scanner(System.in);
    private String nombre;
    private int random;
    @Override
    public void inicio(){
        System.out.println("ingrese su nombre");
        nombre=redeye.nextLine();
    }
    @Override
    public void jugar() {
        int coin=(int)(Math.random()*1+0);
        System.out.println("digite 0 para cara y 1 para sello");
        random=redeye.nextInt();
        if(random==0&&coin==0){
            System.out.println(nombre+" Correcto salio cara");
        }
        else if(random==1&&coin==1){
            System.out.println(nombre+" Correcto salio sello");
        }
        else if(random==1&&coin!=0){
            System.out.println(nombre+" intentalo de nuevo salio cara");
        }
        else if(random==0&&coin!=1){
            System.out.println(nombre+" intentalo de nuevo salio sello");
        }
        else{
            System.out.println("valor No permitido");
        }
    }
    @Override
    public void finalizar() {
    }
}