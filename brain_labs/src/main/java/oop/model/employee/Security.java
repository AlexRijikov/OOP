package oop.model.employee;

public class Security extends Employee {

    public Security(String surname, String name, String midleName, int dateOfBirth, int monthOfbBirth, int yearOfBirth, String phoneNumber, String dateOfEmployment, String monthOfEmployment, String yearOFEmpoyment, int salary, char presence) {
        super(surname, name, midleName, dateOfBirth, monthOfbBirth, yearOfBirth, phoneNumber, dateOfEmployment, monthOfEmployment, yearOFEmpoyment, salary, presence);
    }

    public void rabota() {
        System.out.println("Охраник говорит по рации - пришел клинт.");

    }

    public void checkBypass() {
        System.out.println("Охраник сделал контрольный обход, можно закрывать магазин.");
    }

    @Override
    public void goOutForLunch() {
        System.out.println("Охраник пообедал и приступат к работе.");
        super.goOutForLunch();
    }

    @Override
    public void toDoWork() {
        System.out.println("Охранник наблюдает за кассой.");
    }

    @Override
    public void comeForLunch() {
        System.out.println("Охраник идет на обед.");
    }

    @Override
    public void comeToWork() {
        System.out.println("Охраник пришел на работу");
    }

    @Override
    public void leaveTheJob() {
        System.out.println("Охраник ушел с работы.");
    }

    @Override
    public String toString() {
        return "Security{}";
    }

}
