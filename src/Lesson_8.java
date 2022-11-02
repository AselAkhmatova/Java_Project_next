import java.util.ArrayList;
import java.util.List;



public class Lesson_8<T> {




    public void main(String[] args){

          String[]  arr = new String [] {"one","two","three"};

            ArrayList <String> arrayList = new ArrayList<String>();
            arrayList.add("A");
            arrayList.add("two");
            arrayList.add("C");

            System.out.println(arrayList);

            arrayList.add(1,"b");
            System.out.println(arrayList);

            arrayList.add(1,"B");
            System.out.println(arrayList);

            System.out.println(arrayList.contains("b"));
            System.out.println(arrayList.indexOf("C"));


            List<Integer> arr2 = new ArrayList<Integer>(3);
            arrayList.remove(2);
            arr2.add(2);

            List <Person> people = new ArrayList<Person>(3);
            people.add((new Person("Jon")));


            for(int i =0; i < arr2.size();i++){

                System.out.println(people.get(i).getName());
            }

            for(Person p: people){

                System.out.println(p.getName());
            }



            }

    static <T> void printArray(List<T>[] arr){

        System.out.println(" [");

        for(int i=0; i < arr.length; i++) {

            System.out.println(arr[i]);
            if(i != (arr.length- 1)){

                System.out.println(arr[i]);
            }
        }

    }



}

