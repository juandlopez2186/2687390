import java.util.Scanner;;
public class Challenge21 {
    public static void main(String[] args) {
        Scanner redeye=new Scanner(System.in);
        // declaracion arreglo 
        int []vector=new int[10];
        //rellenar vector
        int []vector1={30,40,30,20,10,3,42,53,6,70};
        int []vector2={24};
        for(int p=0;p<vector.length;p++){
            System.out.print(vector1[p]+" ");   
        }
        for (int i : vector2) {
            System.out.println(i);
        }
        //rellenar de forma dinamica 
        for(int p=0;p<vector.length;p++){
            System.out.print("digite el dato de la posicion "+p);
            vector1[p]=redeye.nextInt(); 
    
        }
    redeye.close();
    }
}
