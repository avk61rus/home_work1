package geekbrains.Lesson6.Animals;

public class Animal {
   protected String name;
   protected String color;
   protected String skills;
   protected String length;

    public Animal(String name, String color, String skills, int length) {
        this.name = name;
        this.color = color;
        this.skills = skills;
        length = length;
    }
    public void run() {System.out.printf("Животное %s %s %s ходит\n", skills, color, name/*, length*/);}
    public void eats() {System.out.printf("Животное %s %s %s %d ест\n", skills, color, name, length);}
    public void sleeping() {System.out.printf("Животное %s %s %s %d спит\n", skills, color, name, length);}
    public void lie() {System.out.printf("Животное %s %s %s %d бегает\n", skills, color, name, length);}
    public void see() {System.out.printf("Животное %s %s %s %d смотрит\n", skills, color, name, length);}
//    public void hunts() {System.out.printf("Животное %s %s %s %d охотится\n", skills, color, name,length);}
    public void sound() {System.out.printf("Животное %s %s %s мычит\n", skills, color, name/*, length*/);}
}