package geekbrains.Lesson6;

class Animal {
    String name;
    String color;
    String skills;

//    public Animal(String name, String color, String skills) {
//        super();
//        this.name = name;
//        this.color = color;
//        this.skills = skills;
//    }
    public void run() {System.out.printf("Животное %s %s %s ходит\n", skills, color, name);}

    public void eats() {System.out.printf("Животное %s %s %s ест\n", skills, color, name);}
    public void sound() {System.out.printf("Животное %s %s %s мычит\n", skills, color, name);}
}
