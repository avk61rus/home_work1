package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;

public class Giraffe extends Animal {
//    private String name;
//    private String color;
//    private String skills;
//    private int length;
//    private lengthSwim;

    public Giraffe(String name, String color, String skills, int length, int lengthSwim) {
        super(name, color, skills, length, lengthSwim) ;
    }

    @Override
    public void run(int length) {
        System.out.printf("Животное %s %s %s ,пробежало %d метров.\n", skills, color, name, length);
    }

    public void run1() {
        System.out.printf("Животное %s %s %s ,не может столько пробежать.\n", skills, color, name, length);
    }

    @Override
    public void swim()  {
        System.out.printf("Животное: %s %s %s плавать не умеет! Он пешком по дну перейдет эту лужу.\n", skills, color, name, lengthSwim);
    }


}
