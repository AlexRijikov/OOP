package ua.zp.brain.labs.oop.basics.alex_rijikov;

public class MainLesson7 {
    public static void main(String[] args) {

        Book Book = new Book( " alex","albert",1992,100,5);
        Book.infoBooc();
        Book.chapter();
        StoreCustomer StoreCustomer = new StoreCustomer(" Alex",24 ,"arijikov88@dmail.com");
        StoreCustomer.infoStore();
        PostOffice PostOffice = new PostOffice( "Новая Почта","223.356.617.7");
        PostOffice.infoPost();

    }

}

