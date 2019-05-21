package abstrukt;

public abstract class AbstractDevice {
    private String name;
    private int serialNumber;

abstract void powerOn();
abstract void powerOff();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "AbstractDevice{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractDevice)) return false;

        AbstractDevice that = (AbstractDevice) o;

        if (getSerialNumber() != that.getSerialNumber()) return false;
        return getName() != null ? getName().equals(that.getName()) : that.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getSerialNumber();
        return result;
    }

    public AbstractDevice() {
        powerOn();

    }
    public AbstractDevice(String name,int serialNumber){

    }
}

