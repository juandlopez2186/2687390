import java.util.Scanner;
public class Challenge14 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        int tot,pre,gas,x,pop;
        pre=100000;
        tot=0;
        x=1;
        System.out.println("cuantos gastos desea registrar");
        gas=redeye.nextInt();
        while (x<=gas) {
            System.out.println("registre el gasto");
            pop=redeye.nextInt();
            tot=tot+pop;
            pre=100000;
            pre=pre-tot;
            x=x+1;
            System.out.println("sus gastos hasta ahora son "+tot+" y el presupuesto que le queda es de "+pre);
        }
        redeye.close();
    }
}
