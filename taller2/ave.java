package taller2;
public class ave extends animal {
    String envergadura;
    public ave() {
    }
    public ave(String name, int edad, String envergadura){
        super(envergadura, edad);
        this.envergadura=envergadura;
    }
    //get
    public String getEnvergadura() {
        return envergadura;
    }
    //set
    public void setEnvergadura(String envergadura) {  
        this.envergadura = envergadura;
    }
    //metodo propio
    public void mostrarave(String envergadura) {
        System.out.println("el nombre es "+getNombre()+"y tiene"+getEdad()+"la envergadura es "+envergadura);
    }
}
