package geekbrains.lesson2;

public class HomeWork2<arr1> {
    public static void main(String[] args) {
        replaceValue();                        // for task 1
        progressionThree();
        multiplyByTwo();
        twoDiagonals();
        arrMaxMin();



    }

//    private static void arrMaxMin() {
//        int i = 0;
//        int[] my = new int[]{1, 1, 3, 1, 2, 4};
//    }


    // task #1
    /* --------------------------------------------------------------------*/
    private static void replaceValue() {
        int[] arr1 = {1, 1, 0, 1, 0, 0, 1, 0, 1, 1};
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
                System.out.print(arr1[i] + " ");
            }
            else {
                arr1[i] = 0;
                System.out.print(arr1[i] + " ");
            }
        }   System.out.println("\n\n// task #2");
    }

    // task #2
    /* --------------------------------------------------------------------*/

    private static void progressionThree() {
        int K = 3;
        int i=0;
        int[] arr2 = new int[8];
        arr2[i]=i;
        System.out.print(  arr2[i] + " ");
        for (i = 1; i < 8; i ++) {
            arr2[i]=(arr2[i - 1] + K);
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n\n// task #3");
    }

    // task #3
    /* ----------------------------------------------------------------------*/

    private static void multiplyByTwo() {
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i < arr3.length; i++) {System.out.print(arr3[i] + "  ");}
             System.out.print("\n");
        for (int i=0; i < arr3.length; i++) {
            if (arr3[i] < 6) { arr3[i] = arr3[i] * 2;
        }
        System.out.print(arr3[i] + "  ");
        }   System.out.println("\n\n// task #4");
    }

    // task #4
    /* ----------------------------------------------------------------------*/
    private static void twoDiagonals() {
        int y,x, c, d;
        y = 9;
        x = 9;
        c = y;
        d = y;
        int[][] arr4 = new int[x][y];
        for (y = 0; y < arr4.length; y ++) {
            for (x = 0; x < arr4[y].length; x ++) {
                if(y == x) {
                    arr4[x][y] = d;
                    arr4[x][c - 1 - x] = d;
                    arr4[c - 1- x][y] = d;
                }
                System.out.print(arr4[y][x] + "  ");
            }
            System.out.println();
        } System.out.println("\n// task #5");
    }

    // task #5
    /* ----------------------------------------------------------------------*/
    private static void arrMaxMin() {
       int s, maximum, minimum, k;
        minimum = 15; s=0;
        int[] my = new int[]{1, -5, 3, 2, 2, 4};
        k = my.length;
        if (my[s] > my[my.length - 1]) {
            maximum = my[s];
            minimum = my[my.length - 1];
        } else {
            minimum = my[s];
            maximum = my[my.length-1];
        }
        for (s = 0; s < my.length; s++) {
            if (maximum > my[s]) maximum = maximum;
            else maximum = my[s];
        }
        for (s = 0; s < my.length; s++) {
            if (minimum < my[s]) minimum = minimum;
            else minimum = my[s];
        }
            System.out.println("Максимум = " + maximum);
            System.out.println("Минимум = " + minimum);
            System.out.println("\n// task #6");
        }


}