package retostaller2POO.principal;
import retostaller2POO.Health.Person;
public class inicio {
    public static void main(String[] args) {
       Person pe=new Person();
       pe.pedirDatos();
       pe.mostrarPersona();
       pe.calcularlmc();
       pe.mayoredad();
    }
}
