package packages.transport;


public class PassportUtil {

    private PassportUtil() {
    }

    public static Passport overrun(Passport oldPasport, String newName) {
        Passport pasport = new Passport();
        pasport.setOwnerName(newName);
        pasport.setManufacturer(oldPasport.getManufacturer());
        pasport.setModel(oldPasport.getModel());
        return pasport;
    }

    public static void main(String[] args) {
        Passport kia = new Passport();
        kia.setModel("Sport");
        kia.setOwnerName("Sasha");
        kia.setManufacturer("South Korea");
        kia.setSeries(302);
        kia.setYearOfIssue(2018);
        Passport kia2 = overrun(kia, "Egor");
        System.out.println(kia);
        System.out.println(kia2);


    }

}
