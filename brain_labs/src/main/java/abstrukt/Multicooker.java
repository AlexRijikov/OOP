package abstrukt;

public class Multicooker extends AbsractCooker {


    public Multicooker(String samsung, int i) {

    }

    @Override
    void powerOn() {
        System.out.println("Мультиварка включена!");
    }

    @Override
    void powerOff() {
        System.out.println(" Мультиварка выключена ");
    }
    @Override
    void cook() {
        System.out.println("Микроволновка  готовит ");
    }

    void switcProgram() {
        System.out.println("Выбери программу");
    }
}
