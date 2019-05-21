package packages.citizen;

public class PassportUtil {

    //  закрытый конструктор
    private PassportUtil() {
        //  закрытый конструктор
    }

    static void marriageRegistrate(Passport suprug1, Passport suprug2) {
        suprug1.setNamberID(suprug2.getNamberID());
        suprug2.setNamberID(suprug1.getNamberID());
    }

}

