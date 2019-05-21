package oop.model.Client;

import oop.model.core.Person;

public class Client extends Person {


    private String discontCard;
    private int maney;

    public Client(String surname, String name, String midleName, int dateOfBirth, int monthOfbBirth, int yearOfBirth, String phoneNumber, String discontCard, int maney) {
        super(surname, name, midleName, dateOfBirth, monthOfbBirth, yearOfBirth, phoneNumber);
        this.discontCard = discontCard;
        this.maney = maney;
    }

    public void сameToTheStore() {
        System.out.println("Клиен пришел в магазин.");
    }

    public void leftTheStore() {
        System.out.println("Клиен покинул магазин.");
    }

    public void infoTovar() {
        System.out.println("Клиен узнаёт про товар.");

    }

    public String getDiscontCard() {
        return discontCard;
    }

    public void setDiscontCard(String discontCard) {
        this.discontCard = discontCard;
    }

    public int getManey() {
        return maney;
    }

    public void setManey(int maney) {
        this.maney = maney;
    }

    public void buy() {
        System.out.println("Клиент говорит - Покупаю.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        if (getManey() != client.getManey()) return false;
        return getDiscontCard() != null ? getDiscontCard().equals(client.getDiscontCard()) : client.getDiscontCard() == null;
    }

    @Override
    public int hashCode() {
        int result = getDiscontCard() != null ? getDiscontCard().hashCode() : 0;
        result = 31 * result + getManey();
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "discontCard='" + discontCard + '\'' +
                ", maney=" + maney +
                '}';
    }
}
