package oop.model.employee;

// Рабочий - Менеджер.
public class Manager extends Employee {

    public Manager(String surname, String name, String midleName, int dateOfBirth, int monthOfbBirth, int yearOfBirth,
                   String phoneNumber, String dateOfEmployment, String monthOfEmployment, String yearOFEmpoyment,
                   int salary, char presence, String department) {
        super(surname, name, midleName, dateOfBirth, monthOfbBirth, yearOfBirth, phoneNumber, dateOfEmployment, monthOfEmployment, yearOFEmpoyment, salary, presence);
        this.department = department;
    }

    private String department; // В каком отделе работает.

    // Консультировать
    public void consult() {
        System.out.println("Менеджер консультирен клиента по товару.");
    }

    // закрить отдел.
    public void closeDepartament() {
        System.out.println("Менеджер закрыл отдел можно идти дамой.");
    }

    //Скидки
    public void rotateAboutDiscounts() {
        System.out.println("Менеджер росказывает о скидках.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void toDoWork() {
        System.out.println("Менеджер делает работу.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;

        Manager manager = (Manager) o;

        return getDepartment() != null ? getDepartment().equals(manager.getDepartment()) : manager.getDepartment() == null;
    }

    @Override
    public int hashCode() {
        return getDepartment() != null ? getDepartment().hashCode() : 0;
    }

    @Override
    public void comeToWork() {
        System.out.println("Менеджер прищел на работу.");

    }

    @Override
    public void comeForLunch() {
        System.out.println("Менеджер пошел на обед.");
    }

    @Override
    public void leaveTheJob() {
        System.out.println("Менеджер ушел с работы.");


    }

    @Override
    public void goOutForLunch() {
        System.out.println("Менеджер уже пообедал и приступает к работе.");
        super.goOutForLunch();
    }
}

