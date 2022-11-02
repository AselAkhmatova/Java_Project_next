public class Person {

    /*Задача №7
        Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает
        имя с префиксом “Mr. ” если пол указан как мужской и префикс “Ms. ” если женский.


        Задача №8
        В классе Person добавьте поле yearOfBirth (год рождения) и сделайте это поле неизменяемым которое
        можно задать только через конструктор.
        Удалите поле age из конструкторов и удалите setter метод для этого поля.
        Измените getter для поля age чтобы он возвращал возраст как целое количество лет

        подсказка как найти текущий год (попробуйте сначала найти сами) подсказку видно если выделить текст следующей строки :
        https://stackoverflow.com/questions/136419/get-integer-value-of-the-current-year-in-java*/

    String name;
    int age;
    char sex;
    private int yearOfBirth;
    public Person(String name,int age,char sex) {

        this.name = name;
        this.age = age;
    }
    public  Person (String name){

        this.name = name;
    }

    void printObject(){

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = (int)age;
    }

    public void setName(String name) {
        this.name = name;
    }


    boolean getName(){

       if (sex == 'F'){

           System.out.println("Ms " + this.name + ", age = " + this.age + " years old,  sex: " + this.sex);

       }if(sex == 'M'){

           System.out.println("Mr " + this.name + ", age = " + this.age + " years old,  sex: " + this.sex);

       }


        return false;
    }

}
