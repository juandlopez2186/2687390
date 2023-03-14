package taller2;
import java.util.Scanner;
public class Movie {
    Scanner redeye=new Scanner(System.in);
    private String name;
    private String category;
    int year;
    public int duration;
    public Movie(){}
    public Movie(String name,String category, int year, int duration){
        this.name=name;
        this.category=category;
        this.duration=duration;
        this.year=year;
    }
    public void AddMovie() {
        System.out.println("ingrese el nombre de la pelicula");
        name=redeye.nextLine();
        System.out.println("ingrese la categoria de la pelicula ");
        category=redeye.nextLine();
        redeye.nextLine();
        System.out.println("ingrese la duracion de la pelicula");
        duration=redeye.nextInt();
        System.out.println("ingrese el año");
        year=redeye.nextInt();
        System.out.println(name+category+duration+year);
    }
    public static void main(String[] args) {
        Movie up=new Movie();
        Movie la_noche_del_demonio=new Movie();
        up.AddMovie();
        la_noche_del_demonio.AddMovie();
    }
}

