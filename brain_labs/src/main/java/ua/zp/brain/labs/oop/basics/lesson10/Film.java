package ua.zp.brain.labs.oop.basics.lesson10;

public class Film {
    public static final String COMEDY = "Комедия";
    public static final String FENTAZI = "Фантачтика";
    public static final String HOROR = " Ужасы";

    private String title;
    private int duration;
    private String genre;



    public  String getTitle() {
        return title;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public  int getDuration() {
        return duration;
    }

    public  void setDuration(int duration) {
        this.duration = duration;
    }

    public  String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Film(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        System.out.printf(" Фильм '%s', создан .\n",this.title);

    }

    {
        System.out.println( "Создается новый Фильм" );
    }
}
