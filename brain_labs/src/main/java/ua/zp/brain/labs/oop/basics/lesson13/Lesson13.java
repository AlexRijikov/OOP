package ua.zp.brain.labs.oop.basics.lesson13;

public class Lesson13 {

    static Lesson13 a1 = new Lesson13(1, " one");
    static Lesson13 a2 = new Lesson13(2, " one");
    static Lesson13 a3 = new Lesson13(3, " two");
    Lesson13 a4 = new Lesson13(1, null);
    Lesson13 a5 = new Lesson13(1, null);


    public Lesson13(int i, String s) {

    }

    public static void main(String[] args) {
        boolean equals;
        if (a1.equals(a1)) equals = true;
        else equals = false;
        boolean equals1 = a1.equals(a2);
        boolean equals2 = a2.equals(a3);
        boolean equals3 = a2.equals(a3);


    }


}
