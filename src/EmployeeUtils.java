public class EmployeeUtils {

    /*Задача №5
    Необходимо создать утилитарный класс EmployeeUtils со следующими методами:
    поиск сотрудника в массиве по его имени
    поиск сотрудника в массиве по вхождению указанной строки в его имени
    подсчет зарплатного бюджета для всех сотрудников в массиве
    поиск наименьшей зарплаты в массиве
    поиск наибольшей зарплаты в массиве*/



        public static void getName(String name1){
            String[] name = new String[3];

            for (int i = 0; i < name.length; i++) {

                if (name.equals(name1)) {

                    System.out.println(name);
                }
            }

        }


}
