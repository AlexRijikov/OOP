package ua.zp.brain.labs.oop.basics.alex_rijikov;

public class StoreCustomer {

    public  String nameCustomer;
    public int ageCustomer;
    public String mailCustomer;

    public String getNameCustomer() {
        return nameCustomer;
    }

    public int getAgeCustomer() {
        return ageCustomer;
    }

    public void setAgeCustomer(int ageCustomer) {
        this.ageCustomer = ageCustomer;
    }

    public String getMailCustomer() {
        return mailCustomer;
    }

    public void setMailCustomer(String mailCustomer) {
        this.mailCustomer = mailCustomer;
    }

    public StoreCustomer(String nameCustomer, int ageCustomer, String mailCustomer) {
        this.nameCustomer = nameCustomer;
        this.ageCustomer = ageCustomer;
        this.mailCustomer = mailCustomer;

    }

    @Override
    public String toString() {
        return "StoreCustomer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", ageCustomer=" + ageCustomer +
                ", mailCustomer='" + mailCustomer + '\'' +
                '}';

    }
    public void infoStore (){
        System.out.println( "Имя покупателя - " + nameCustomer +";"+ " возраст покупателя - "
                + ageCustomer + ";"+ " e_mail покупателя - " + mailCustomer);
    }

}


