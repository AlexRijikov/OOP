package abstrukt;

public class Oven extends AbsractCooker {
    void initTimer(){}

    public Oven() {

    }

    @Override
    void cook() {
        System.out.println(" Печь готовит ");

    }
}
