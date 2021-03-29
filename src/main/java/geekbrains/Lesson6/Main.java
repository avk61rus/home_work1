package geekbrains.Lesson6;

import geekbrains.Lesson6.Animals.Animal;

public class Main {



    public static void main(String[] args) {


//    Giraffe z = new Giraffe("Жирик", "рыже-пятнистый", "гладкошерстный,",0);
//    Fox l = new Fox("Лиса-патрикеевна", "рыжая", "пушистая,", 0);

//    z.sound();
//    l.sound();
//    l.run();
//    l.hunts();

        int length = 600;
        Animal[] zoo = {
                new Giraffe ("Жирик", "рыже-пятнистый", "гладкошерстный,", length),
                new Fox ("Лиса-патрикеевна", "рыжая", "пушистая,", length )
        };

        for (Animal animal : zoo) {
            animal.sound();
            animal.run(length);





        }




    }
}
