package ua.zp.brain.labs.oop.basics.lesson10;

public class myLeson {
    public static void main(String[] args) {


        Film film = new Film("Monstrs", 234, Film.HOROR);
        Library library = new Library("Favorit");
    }

    public static int wanarr(Library library) {
        for (int i = 0; i < library.getArray().length; i++) {
            if (library.getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }
}