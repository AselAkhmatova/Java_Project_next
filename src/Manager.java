public class Manager extends Worker{

    /*Необходимо создать класс Manager в который нужно добавить следующие методы:
    getNumberOfSubordinates - получить количество подчиненных
            setNumberOfSubordinates

    в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> *
            (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.

    Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary
    должен возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
    Если количество подчиненных 0, то результат как у обычного рабочего.*/

    private int NumberOfSubordinates;

    public Manager(String name) {
        super(name);
    }

    public int getNumberOfSubordinates() {return NumberOfSubordinates;}

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary(){

        return getNumberOfSubordinates() == 0 ? (super.getBaseSalary()):(super.getBaseSalary() * (getNumberOfSubordinates() / 100 * 3));
    }
}
