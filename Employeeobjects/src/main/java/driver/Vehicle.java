package driver;

public class Vehicle {
    private String hasDoors;
    protected String hasWheels;

    public Vehicle(String hasDoors,String hasWheels){
        this.hasDoors=hasDoors;
        this.hasWheels=hasWheels;
    }

    public int numberOfWheels(int x){
        return 10;
    }

    public String getHasDoors() {
        return hasDoors;
    }

    public void setHasDoors(String hasDoors) {
        this.hasDoors = hasDoors;
    }

    public String getHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(String hasWheels) {
        this.hasWheels = hasWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "hasDoors='" + hasDoors + '\'' +
                ", hasWheels='" + hasWheels + '\'' +
                '}';
    }
}
