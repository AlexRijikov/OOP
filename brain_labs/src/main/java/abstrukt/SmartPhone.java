package abstrukt;

public class SmartPhone extends Mobile {
    private String os;

    @Override
    public String toString() {
        return "SmartPhone{" +
                "os='" + os + '\'' +
                '}';
    }



    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }


    public SmartPhone(String os) {
        this.os = os;
    }

    void rumArr(){
        System.out.println( "Операцтонная система - ");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone)) return false;
        if (!super.equals(o)) return false;

        SmartPhone that = (SmartPhone) o;

        return getOs() != null ? getOs().equals(that.getOs()) : that.getOs() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getOs() != null ? getOs().hashCode() : 0);
        return result;

    }
}
