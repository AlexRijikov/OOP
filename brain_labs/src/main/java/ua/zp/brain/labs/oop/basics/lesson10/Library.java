package ua.zp.brain.labs.oop.basics.lesson10;

public class Library {
    private final Film[] array;
    private  final String name;

    public Film[] getArray() {
        return array;
    }

    public String getName() {
        return name;
    }

    public Library(String name) {
        this.name = name;
        System.out.printf(" Библиотека '%s', успешно создана \n", this.name);
    }

    {
        array = new Film[5];
        array[0] = new Film(" ара", 120, Film.COMEDY);
        array[1] = new Film("wer", 130, Film.HOROR);
        System.out.println(" Добавлены любимые фильмы ");
    }

}
