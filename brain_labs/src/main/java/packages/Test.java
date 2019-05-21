package packages;

import packages.citizen.Passport;
import packages.technics.PassportUtil;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Passport citixenPassport = new Passport();
        packages.technics.Passport technicsPassport = new packages.technics.Passport();
        packages.transport.Passport transportPassport = new packages.transport.Passport();

        technicsPassport.setStartDate(new Date(12345));
        System.out.println(technicsPassport.getStartDate());
        PassportUtil.warrantyReplace(technicsPassport);
        System.out.println(technicsPassport.getStartDate());


    }

}
