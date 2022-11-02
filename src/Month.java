public class Month extends MonthUtils{

    /*Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней. Создать класс
    MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).*/

    private String nameMonth;
    private int dayMonth;
    private int daySalary;

    public String getNameMonth() {
        return nameMonth;
    }

    public void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
    }

    public int getDayMonth() {
        return dayMonth;
    }

    public void setDayMonth(int dayMonth) {
        this.dayMonth = dayMonth;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }
}
