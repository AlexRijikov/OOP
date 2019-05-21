package packages.citizen;

/**
 * Passport
 * citizen - гражданин.
 */

public class Passport {
    private String nationality;
    private String surname;
    private String name;
    private String midleName;
    private int birthDay;
    private int monthOfBirth;
    private int yearOfBirth;
    private String namberID;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNamberID() {
        return namberID;
    }

    public void setNamberID(String namberID) {
        this.namberID = namberID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
