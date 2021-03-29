package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;

public class Giraffe extends Animal {
//    private String name;
//    private String color;
//    private String skills;
//    private int length;
    public Giraffe(String name, String color, String skills, int length) {
        super(name, color, skills,length) ;
    }

    @Override
    public void run(int length) {
        System.out.printf("Животное %s %s %s ,пробежало %d метров.\n", skills, color, name, length);
    }

}
