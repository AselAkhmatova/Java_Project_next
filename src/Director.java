public class Director extends  Manager{


    public Director(String name) {
        super(name);
    }

    public double getSalary(){

        return getNumberOfSubordinates() == 0 ? (super.getBaseSalary() ):(super.getBaseSalary() * (getNumberOfSubordinates() / 100 * 9));
    }


}
