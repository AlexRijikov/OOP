package oop.model.employee;

import oop.model.core.Person;

// Сотрудник
public class Employee extends Person {

    private String dateOfEmployment; // День прийома на работу.
    private String monthOfEmployment; // Месяц прийома на работу.
    private String yearOFEmpoyment; // Год прйома на работу.

    private int salary; // Зарплата

    public Employee(String surname, String name, String midleName, int dateOfBirth, int monthOfbBirth,
                    int yearOfBirth, String phoneNumber, String dateOfEmployment, String monthOfEmployment,
                    String yearOFEmpoyment, int salary, char presence) {
        super(surname, name, midleName, dateOfBirth, monthOfbBirth, yearOfBirth, phoneNumber);
        this.dateOfEmployment = dateOfEmployment;
        this.monthOfEmployment = monthOfEmployment;
        this.yearOFEmpoyment = yearOFEmpoyment;
        this.salary = salary;
        this.presence = presence;
    }

    private char presence; // Вышел на работу.

    // Реестрация даты прийома на работу.

    void registrationForTheRobot(String dateOfEmployment, String monthOfEmployment, String yearOFEmpoyment) {
        this.dateOfEmployment = dateOfEmployment;
        this.monthOfEmployment = monthOfEmployment;
        this.yearOFEmpoyment = yearOFEmpoyment;
    }

    // Выход на работу.
    public void comeToWork() {
        System.out.println("Пришел на работу");
    }

    //  Выход на обед.
    public void comeForLunch() {
        System.out.println("Пойти на обед");
    }

    // Выход с обеда.
    public void goOutForLunch() {
        System.out.println(" Вишел с обеда ");
    }

    // Уйти с работы.
    public void leaveTheJob() {
        System.out.println("Ушел с работы");

    }

    // Выполнение работы.
    public void toDoWork() {
        System.out.println("Делать работу");
    }


    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEmployment(String monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public String getYearOFEmpoyment() {
        return yearOFEmpoyment;
    }

    public void setYearOFEmpoyment(String yearOFEmpoyment) {
        this.yearOFEmpoyment = yearOFEmpoyment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public char getPresence() {
        return presence;
    }

    public void setPresence(char presence) {
        this.presence = presence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getSalary() != employee.getSalary()) return false;
        if (getPresence() != employee.getPresence()) return false;
        if (getDateOfEmployment() != null ? !getDateOfEmployment().equals(employee.getDateOfEmployment()) : employee.getDateOfEmployment() != null)
            return false;
        if (getMonthOfEmployment() != null ? !getMonthOfEmployment().equals(employee.getMonthOfEmployment()) : employee.getMonthOfEmployment() != null)
            return false;
        return getYearOFEmpoyment() != null ? getYearOFEmpoyment().equals(employee.getYearOFEmpoyment()) : employee.getYearOFEmpoyment() == null;
    }

    @Override
    public int hashCode() {
        int result = getDateOfEmployment() != null ? getDateOfEmployment().hashCode() : 0;
        result = 31 * result + (getMonthOfEmployment() != null ? getMonthOfEmployment().hashCode() : 0);
        result = 31 * result + (getYearOFEmpoyment() != null ? getYearOFEmpoyment().hashCode() : 0);
        result = 31 * result + getSalary();
        result = 31 * result + (int) getPresence();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dateOfEmployment='" + dateOfEmployment + '\'' +
                ", monthOfEmployment='" + monthOfEmployment + '\'' +
                ", yearOFEmpoyment='" + yearOFEmpoyment + '\'' +
                ", salary=" + salary +
                ", presence=" + presence +
                '}';
    }
}

