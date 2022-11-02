public class HW_3 {

    static String task = "\n Task";
    static int num = 2;

    public static void task() {

        System.out.println(task + " # " + (num++));
    }
    public static void main (String [] args) {
        // Задача №1
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};необходимо вывести  сумму всех значений массива.

        task();
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            sum += array[i];
        }
            System.out.println("Sum 9, 2, 6, 4, 5, 12, 7, 8, 6 = " + sum);

        /*Задача №2
         Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.*/

        task();
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array1.length;i++){
            if (array1[i] > max){
                max = array1[i];
            }
        }
        System.out.println("max = " + max);

        /*Задача №3
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.*/

        task();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length;i++){

            if (array[i] < min){

                min = array[1];
            }
        }
        System.out.println("min = " + min);


        /*Задача №4
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.*/

        task();
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum1 = 0;
        for (int i = 0; i < array2.length;i++){

            sum1 = sum1 + array2[i];
        }
        System.out.println("mid average = " + sum1 / array2.length);

       /* Задача №5
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.*/

        task();
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        for(int i = 0; i < array3.length;i++){

            for(int y = 0; y < array3[i].length;y++){

                sum2 = sum2 + array3[i][y];
            }
        }
        System.out.println("sum 2 array = " + sum2);

        /*Задача №6

        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.*/

        task();
        int max1 = Integer.MIN_VALUE;
        for (int i = 0;i < array3.length;i++){

            for(int y = 0 ; y < array3[i].length; y++){

               if (array3[i][y] > max1){

                   max1 = array3[i][y];
               }
            }
        }
        System.out.println("max array = " + max1);

        /*Задача №7
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести количество элементов в массиве.*/

        task();
        int count = 0;
        for(int i = 0; i < array3.length;i++){
            for (int j = 0; j< array3[i].length;j++){

                count++;
            }
        }
        System.out.println("count array = " + count);

        /*Задача от Алисы :
        Написать программу что выводит на печать круг картинкой.
        Любыми символами. Круг может быть овальный, пустой внутри или наполненный символами.
        При написании программы можно использовать любые доступные знания.*/

        task();
           int radius = 10;
           int posX = 10;
           int posY = 20;
           for (int i1 = 0;i1 <= posX + radius; i1++) {
               for (int j = 1;j <=posY + radius; j++) {
                   int xSquared = (i1 - posX)*(i1 - posX);
                   int ySquared = (j - posY)*(j - posY);
                   if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                       System.out.print("# ");
                   } else {
                       System.out.print("  ");
                   }
               }
               System.out.println();
           }

       }


    }
