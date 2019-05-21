package ua.zp.brain.labs.oop.basics.alex_rijikov;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Book  {

    public  String nameBook;
    public String authorBook;
    public int year;
    public  int scroll;
    public int  chapter;

    Book() {
        this.nameBook = "неизвестно";
        this.authorBook = "неизвестно";
        this.year = 0;
        this.scroll = 0 ;
        this.chapter = 0;

    }

    Book(String name, String author, int year,int str, int chapter) {

        this.nameBook = name;
        this.authorBook = author;
        this.year = year;
        this.scroll= str;
        this.chapter = chapter;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getYear() {
        return year;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getScroll() {
        return scroll;
    }

    public void setScroll(int scroll) {
        this.scroll = scroll;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", year=" + year +
                '}';
    }
    public void infoBooc() {

        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", nameBook, authorBook, year);
    }
    public void scrol (){
        for (int i = 0; i <=350 ; i++) {


        }
    }
    public void chapter ( ){
        System.out.println(" Ведите страницу начала главы");
        Scanner scan = new Scanner(System.in);
        int chap=scan.nextInt();

        switch (chap){
            case 1:
              chap =0 ;
                System.out.println( "Начало книги ");
                break;
            case 2:
                chap =3;
                System.out.println(" Описание");
                break;
            case 3:
                chap = 5&6&7&8&9&10&11&12&13&14&15;
                System.out.println(" Глава 1: ");
                break;
            case 4:
                chap = 16&17&18&19&20&21&22&23&24&25&26&27&28&29&30;
                System.out.println(" Глава 2: ");
                break;
            case 5:
                chap = 31&32&33&34&35&36&37&38&39&40&41&42&43&44&45&46&47&48&49&50;
                System.out.println(" Глава 3: ");
                break;
            case 6:
                chap = 51&52&53&54&55&56;
                System.out.println(" Конец ");
                break;
                default:
                    System.out.println(" Нет такой главы ");





        }
    }
   public void definition(){

   }
}
