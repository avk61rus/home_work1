package geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String args[]) {
        gameGuesTheNumber();


//        fillArray2d();
//        int[][] arr = new int[0][]; printArr(arr);


    }

    private static void gameGuesTheNumber() {
        int numberGame = 1;
        while (numberGame == 1) {
             Random random = new Random();
             int randomNumber = random.nextInt(10);
//             System.out.println("загаданное число: " + randomNumber);
             System.out.println("\nУ Вас три попытки угадать число от 3 до 10");
                for (int c = 0; c < 3; c++) {
                    System.out.print("Введите число >>>>   ");
                    Scanner scanner = new Scanner(System.in);
                    int numberInput = scanner.nextInt();
//                    System.out.println("Игрок ввел цифру: " + numberInput);
                    if (randomNumber == numberInput) {
                        System.out.println("\nВы выиграли!");
                        break;
                    } else if (randomNumber < numberInput) {
                        System.out.println("\nЗагаданное число меньше Вашего");
                    } else if (randomNumber > numberInput) {
                        System.out.println("\nЗагаданное число больше Вашего");
                    } // не смог вывести на экран "Вы проиграли" в случае если 
                      // за 3 попытки не удалось отгадать число.
                }
                System.out.println("Загаданное число = " + randomNumber);
                System.out.println("\nСыграем еще? <1> - да,  <2> - нет");
                Scanner scanner = new Scanner(System.in);
                numberGame = scanner.nextInt();
        }
        System.out.println("Игра закончена!");
    }


//    private static void printArr(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//
//    private static void fillArray2d() {
//        int counter = 1;
//        int[][] table = new int[3][4];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                table[i][j] = counter;
//                System.out.print(table[i][j] + " ");
//                counter++;
//            }
//            System.out.println();
//        }
//    }


}