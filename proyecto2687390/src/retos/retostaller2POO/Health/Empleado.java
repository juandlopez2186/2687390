package retostaller2POO.Health;

public class Empleado extends Person {
    private String cargo;
    private String departamento;
    private int valorhora;
    private int horastrabajadas; 
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getValorhora() {
        return valorhora;
    }
    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public Double calcularhonorarios () {
        int valortotal =valorhora*horastrabajadas;
        Double reteica=(valortotal*0.9666);
        double calcularhonorarios=(valortotal-reteica);
    return calcularhonorarios;
    }
}
