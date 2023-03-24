package retostaller2POO.Health;
public class ece {
    public static void main(String[] args) {
        Empleado emp=new Empleado();
        emp.setTypeDoc("cedula");
        emp.setDoc(1031648411);
        emp.setName("javier");
        emp.setLastname("gomez");
        emp.setValorhora(10000);
        emp.setHorastrabajadas(12);
        emp.setCargo("cajero");
        emp.calcularhonorarios();
        System.out.println("el empleado "+emp.getName()+" "+emp.getLastname()+" identificado con "+emp.getTypeDoc()+" numero "+emp.getDoc()+" con el cargo de "+emp.getCargo()+" a trabajado "+emp.getHorastrabajadas()+" horas y el valor de estas son de "+emp.getValorhora()+" dando un total de "+emp.calcularhonorarios()+" a pagar");
    }
}
