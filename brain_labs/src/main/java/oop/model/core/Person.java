package oop.model.core;

public class Person {

    // Класс Человек ( ФИО(fio),Дата рождения,Номер телефона)
    private String surname;
    private String name;
    private String midleName;

    private int dateOfBirth;
    private int monthOfbBirth;
    private int yearOfBirth;

    private String phoneNumber;

    String introduceMyself() {
        return surname + name + midleName;
    }

    String dob() {
        return dateOfBirth + "  " + monthOfbBirth + " " + yearOfBirth;
    }

    String giveNumber() {
        return phoneNumber;
    }

    void greeting() {
        System.out.println("Привет");
    }

    void leave() {
        System.out.println("До свидания");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (dateOfBirth != person.dateOfBirth) return false;
        if (monthOfbBirth != person.monthOfbBirth) return false;
        if (yearOfBirth != person.yearOfBirth) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (midleName != null ? !midleName.equals(person.midleName) : person.midleName != null) return false;
        return phoneNumber != null ? phoneNumber.equals(person.phoneNumber) : person.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = surname != null ? surname.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (midleName != null ? midleName.hashCode() : 0);
        result = 31 * result + dateOfBirth;
        result = 31 * result + monthOfbBirth;
        result = 31 * result + yearOfBirth;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", midleName='" + midleName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", monthOfbBirth=" + monthOfbBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Person(String surname, String name, String midleName, int dateOfBirth, int monthOfbBirth, int yearOfBirth, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.midleName = midleName;
        this.dateOfBirth = dateOfBirth;
        this.monthOfbBirth = monthOfbBirth;
        this.yearOfBirth = yearOfBirth;
        this.phoneNumber = phoneNumber;
    }
}


