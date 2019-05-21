package abstrukt;

public class MainAbstract {
    public static void main(String[] args) {

    Mobile mobile = new Mobile(2,"1080*920");
    mobile.call();
    mobile.powerOff();
        System.out.println(" Мльтиварка");
    Multicooker multicooker = new Multicooker("Samsung",22);
    multicooker.switcProgram();
    multicooker.cook();
    multicooker.powerOff();

    SmartPhone smartPhone = new SmartPhone("iOS");
    smartPhone.setName("Aple");
    smartPhone.setSerialNumber(10);
    smartPhone.rumArr();
    smartPhone.call();


    Oven oven = new Oven();
    oven.setName("Samsung");
    oven.setSerialNumber(1201);
    oven.initTimer();
    oven.cook();
    oven.powerOff();

    turnOffAll(smartPhone,mobile,oven,multicooker);

    }
    private static void turnOffAll(AbstractDevice ... devices){
        for (AbstractDevice divice: devices) {
            divice.powerOff();
        }
    }
}
