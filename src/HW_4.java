public class HW_4 {

   /* Вывести следующие строки с соответствующим форматированием (как пирамиды):


    Задача №1

            0  1  2  3  4  5  6  7  8  9
            0  1  2  3  4  5  6  7  8
            0  1  2  3  4  5  6  7
            0  1  2  3  4  5  6
            0  1  2  3  4  5
            0  1  2  3  4
            0  1  2  3
            0  1  2
            0  1
            0


    Задача №2

            0  1  2  3  4  5  6  7  8  9
            0  1  2  3  4  5  6  7  8
            0  1  2  3  4  5  6  7
            0  1  2  3  4  5  6
            0  1  2  3  4  5
            0  1  2  3  4
            0  1  2  3
            0  1  2
            0  1
            0


    Задача №3

            9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
            8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
            6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
            4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
            2 1 0 1 2
            1 0 1
            0



    */

    public static void main(String [] args){

        for (int i = 0; i < 10; i++) {
            for (int y = 0; y < 10 - i ; y++) {
                System.out.print(y + " ");
            }

            System.out.println("");
        }

        for (int i = 0; i < 10; i++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 10 - i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

        for (int x = 9; x >= 0; x--) {
            for (int k = 0; k < 9 - x; k++) {
                System.out.print("  ");
            }
            for (int i = x; i > 0; i--) {
                System.out.print(i + " ");
            }
            for (int i = 0; i <= x; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
