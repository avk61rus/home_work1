package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;

public class Fox extends Animal {

//    private String name;
//    private String color;
//    private String skills;
//    private int length;
    public Fox(String name, String color, String skills, int length) {
        super(name, color, skills, length);
    }

    @Override
    public void sound() {
        System.out.printf("Животное: %s %s %s тявкает.\n", skills, color, name);
    }



    public void swing() {
        System.out.printf("Животное: %s %s %s не побежит на %d м!.\n", skills, color, name, length);
    }


    public void run1() {
        System.out.printf("Животное: %s %s %s не побежит на  м!.\n", skills, color, name);
    }


}

