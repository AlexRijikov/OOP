package oop.model.employee;

// Рабочий - Кассир.
public class Cashier extends Employee {

    private String ticketNumber;

    public Cashier(String surname, String name, String midleName, int dateOfBirth, int monthOfbBirth, int yearOfBirth,
                   String phoneNumber, String dateOfEmployment, String monthOfEmployment, String yearOFEmpoyment,
                   int salary, char presence, String ticketNumber) {
        super(surname, name, midleName, dateOfBirth, monthOfbBirth, yearOfBirth, phoneNumber,
                dateOfEmployment, monthOfEmployment, yearOFEmpoyment, salary, presence);
        this.ticketNumber = ticketNumber;
    }

    public void receipts() {
        System.out.println("Касса заработала");
    }

    public void closeCassa() {
        System.out.println("Кассир закрыл кассу, можно идти дамой.");
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public void goOutForLunch() {
        System.out.println("Кассир пообедал и приступает к работе.");
        super.goOutForLunch();
    }

    @Override
    public void toDoWork() {
        System.out.println("Кассир длает работу.");
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "ticketNumber='" + ticketNumber + '\'' +
                '}';
    }

    @Override
    public void comeToWork() {
        System.out.println("Кассир пришел на работу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cashier)) return false;

        Cashier cashier = (Cashier) o;

        return getTicketNumber() != null ? getTicketNumber().equals(cashier.getTicketNumber()) : cashier.getTicketNumber() == null;
    }

    @Override
    public void comeForLunch() {
        System.out.println("Кассир пошел на обед.");
    }

    @Override
    public void leaveTheJob() {
        System.out.println("Кассир ушел с работы.");

    }

    @Override
    public int hashCode() {
        return getTicketNumber() != null ? getTicketNumber().hashCode() : 0;
    }
}
