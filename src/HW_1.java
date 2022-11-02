public class HW_1 {

    public static void main (String [] args){

        int a = 11;
        int b = 12;

        int sum = a + b;
        int min = a - b;
        int mul = a * b;
        int div = a / b;
        int remDev = a % b;
        char unicodeSmile = '\uD83E';

        if (a % 2 == 0){

            System.out.println( a + " - chetnor");
        }else{
            System.out.println(a + " - nechetnoe");
        }

        System.out.println("sum = " + sum + "; min = " + min + "; mul = " + mul + "; div = " + div + "; remDev = " + remDev);
        System.out.println(unicodeSmile);




    }
}
