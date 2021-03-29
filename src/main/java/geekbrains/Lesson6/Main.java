package geekbrains.Lesson6;


import geekbrains.Lesson6.Animals.Animal;

public class Main {
    public static void main(String[] args) {

        int length = 0;     //длина пробежки;
        int lengthSwim = 0; //длина заплыва;

        Animal[] zoo = {
                new Giraffe ("Жирик", "рыже-пятнистый", "гладкошерстный,", length, lengthSwim),
                new Fox ("Лиса-патрикеевна", "рыжая", "пушистая,", length, lengthSwim )
        };

// task #1
/*--------------------------------------------------------------------------------*/
        System.out.println("\n// task #1");

        for (Animal animal : zoo) {
             animal.sound();
             animal.run();
             animal.swim();
        }

// task #2 and #3
/*---------------------------------------------------------------------------------*/
        System.out.println("\n// task #2 ");
        length = 199; //длина пробежки (для жирафа 200м, для лисы 500м;
        lengthSwim = 19;  //длина заплыва (жираф не плавает, лиса проплывет 10м;
        animalRun(length, zoo);



        animalSwim(lengthSwim, zoo);

    }



    private static void animalRun(int length, Animal[] zoo) {
        for (Animal animal : zoo) {
            if ( animal instanceof Fox ) {
                if (length > 500) ((Fox) animal).run1();
                else animal.run(length);
            } else if (length > 200) ((Giraffe) animal).run1();
                        else animal.run(length);
        } System.out.println("\n// task #3 ");
    }


    private static void animalSwim(int lengthSwim, Animal[] zoo) {

        for (Animal animal : zoo) {
            if ( animal instanceof Fox ) {
                if (lengthSwim > 10 ) ((Fox) animal).swim1();
                else ((Fox) animal).swim();
            } else if (lengthSwim >= 0) ((Giraffe) animal).swim();
                  //else /*animal.run(lengthSwim);


        }
        System.out.println(lengthSwim);


    }

}











