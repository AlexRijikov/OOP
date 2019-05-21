package abstrukt;

public class DialPhone extends Phone {
    private String hasArswerphone;
    @Override
    void powerOn(){
        System.out.println("Телефон включен!");
    }
    @Override
    void powerOff() {
        System.out.println("Телефон виклчен!");

    }
    @Override
    void call() {
        System.out.println("Телефон звонит ");
    }

    public String getHasArswerphone() {
        return hasArswerphone;
    }

    public void setHasArswerphone(String hasArswerphone) {
        this.hasArswerphone = hasArswerphone;
    }

    public DialPhone(String hasArswerphone) {
        this.hasArswerphone = hasArswerphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DialPhone)) return false;
        if (!super.equals(o)) return false;

        DialPhone dialPhone = (DialPhone) o;

        return getHasArswerphone() != null ? getHasArswerphone().equals(dialPhone.getHasArswerphone()) : dialPhone.getHasArswerphone() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getHasArswerphone() != null ? getHasArswerphone().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DialPhone{" +
                "hasArswerphone='" + hasArswerphone + '\'' +
                '}';
    }

    void autoAnswer (){
        System.out.println(" Автоматический ответ ");

    }
}
