package taller2;
import java.util.Scanner;
public class Movie {
    Scanner redeye=new Scanner(System.in);
    private String name;
    private String category;
    private int year;
    private int duration;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public static void main(String[] args) {
        Movie up=new Movie();
        up.setName("la nueva era");
        up.setCategory("aventura");
        up.setDuration(3);
        up.setYear(2006);
        System.out.println("el nombre de la pelicula es "+up.getName()+" la categoria de la peicula es "+up.getCategory()+" su duracion es de "+up.getDuration()+" horas y el año de estreno es "+up.getYear());
    }
    public void ad() {
        System.out.println("hola");
    }
    public void ad(String name) {
        System.out.println("jailer");
    }
    public void ad(String name,int year) {
        System.out.println("bienvenido");
    }
}

