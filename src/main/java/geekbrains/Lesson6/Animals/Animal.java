package geekbrains.Lesson6.Animals;

public class Animal {
    protected String name;
    protected String color;
    protected String skills;
    protected int length;

    public Animal(String name, String color, String skills, int length) {
        this.name = name;
        this.color = color;
        this.skills = skills;
        this.length = length;
    }

    public void sound() {
        System.out.printf("Животное: %s %s %s мычит.\n", skills, color, name);
    }

    public void swim() {
        System.out.printf("Животное: %s %s %s плывет.\n", skills, color, name);
    }

    public void run(int length) {
        System.out.printf("Животное %s %s %s ,бежит %d.\n", skills, color, name, length );
    }
}

