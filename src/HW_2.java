public class HW_2 {

    public static void main(String [] args){

        /* Task 1
          Необходимо создать две целочисленные переменные (a, b),
          присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
          a == b - если переменные равны
          a < b - если переменная a меньше b
          a > b - если переменная b меньше a */

        int a = 6;
        int b = 5;

        System.out.println("Task 1");

        if(a == b) {

            System.out.println(a + " = " + b);
        } else if  ( a < b){

            System.out.println(a + " <  " + b);
        }else {

            System.out.println(a + " > " + b);
        }

        /* TASK 2
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная */

       int a1 = 45;
       int b1 = 55;

       int sum = a1 + b1;

       System.out.println("################################################");
       System.out.println("Task 2");
       if (sum % 2 == 0){

           System.out.println("maybe a and b are even");
       }else{

           System.out.println("some variable is odd");
       }

      /*
     Необходимо создать целочисленную переменную, присвоить произвольное значение переменной
     на ваш выбор и вывести следующие строки:
     больше 10 - если переменная больше 10
     меньше 100 - если переменная меньше 100
     результат деления на 2 больше 20 - если это соответствует истине
     значение переменной между 5 и 40 включительно - если это правда
     значение переменной меньше 5 или больше 40 - если предыдущие условие ложное */

    int l = 40;

    System.out.println("################################################");
    System.out.println("Task 3");

    if (l > 10){

        System.out.println(l + "  больше 10");
    } if(l < 100){

        System.out.println(l + " меньше 100");
    }if (l / 2 > 20){

            System.out.println("результат деления на 2 больше 20");
    }if ( l >= 5 && l <= 40){

            System.out.println("значение переменной между 5 и 40");
    }else{

            System.out.println("значение переменной меньше 5 или больше 40");
        }

    /* TASK 4
    Необходимо вывести числа от 0 до 15.*/

        int i = 0;

        System.out.println("################################################");
        System.out.println("Task 4");

        for(i = 0;i <=15; i++){

           System.out.println(i + " ");
        }

        /* TASK 5
        Необходимо вывести все положительные степени числа 5 к
        оторые меньше 10000, вывести результат возведения в степень.
         */

        int result = 1;

        System.out.println("################################################");
        System.out.println("Task 5");

        for(int i1 = 1; i1 <= 1000;i1 = i1 * 5) {

            System.out.println(i1);
        }

        /*
        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        Реализовать 2 варианта:
        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение) */

        System.out.println("################################################");
        System.out.println("Task 5");


        for(int i3 = 40; i3 <= 60; i3++){

            if (i3 % 4 == 0){

                System.out.println(i3);
            }
        }









    }


















}
