package abstrukt;

public class Mobile extends Phone {
    private int simCout;
    private String displey;

    public Mobile(int simCout, String displey) {
        this.simCout = simCout;
        this.displey = displey;
    }

    public Mobile() {
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "simCout='" + simCout + '\'' +
                ", displey='" + displey + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mobile)) return false;
        if (!super.equals(o)) return false;

        Mobile mobile = (Mobile) o;

        if (getSimCout() != mobile.getSimCout()) return false;
        return getDispley() != null ? getDispley().equals(mobile.getDispley()) : mobile.getDispley() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSimCout();
        result = 31 * result + (getDispley() != null ? getDispley().hashCode() : 0);
        return result;
    }

    public int getSimCout() {
        return simCout;
    }

    public void setSimCout(int simCout) {
        this.simCout = simCout;
    }

    public String getDispley() {
        return displey;
    }

    public void setDispley(String displey) {
        this.displey = displey;
    }

    @Override
    void powerOn() {
        System.out.println("Мобильный телефон" + getName()+ "включен");

    }

    @Override
    void powerOff() {
        System.out.println("Мобильный телефон выключен");

    }


    @Override
    void call() {
        System.out.println(" Мобильный телефон звонит ");

    }
}
