import java.util.Scanner;
public class Challenge9 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        String user,password;
        System.out.println("Digite su Nombre de usuario");
        user=redeye.nextLine();
        System.out.println("Digite su Contraseña");
        password=redeye.nextLine();
        if(user.equals("Eduardo")&&password.equals("123"))
        {
            System.out.println("bienvenido "+user);
        }
        else if(user!="Eduardo"&&password.equals("123")){
            System.out.println("Algo pasa con tus datos de acceso");
        }
        else if(user.equals("Eduardo")&&password!="123"){
            System.out.println("Parece que olvidaste tus credenciales de acceso");
        }
        else{
            System.out.println("Acceso denegado");
        }        
        redeye.close();
    }
}
