public class Employee {

    /*Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и полем зарплата.
    Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого
    был вызван метод и сотрудника который был передан как параметр, одинаковое имя.

     Необходимо создать класс Employee со следующими методами:
    getBaseSalary - получить базовую ставку
    set Base Salary
    getName - получить имя
    setName
    getSalary - получить зарплату*/
    private String name;
    private int age;
    private double salary;
    private char gender;
    private double baseSalary;

    private double dalySalary;

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public double getDalySalary() {return dalySalary;}

    public void setDalySalary(double dalySalary) {
        this.dalySalary = dalySalary;
    }

    public double getBaseSalary() {return baseSalary;}

    public void setBaseSalary(double baseSalary) {this.baseSalary = baseSalary;}

    public double getSalary() {return salary;}

    public void setSalary(double salary) {this.salary = salary;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Employee(String name, int age, char gender, int salary) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Employee(String name) {

        this.name = name;
    }

    public boolean isSameName(String employee) {

        Employee employee1 = new Employee(employee);
        if (employee1.equals(employee)) {

        }

        return true;


    }
}