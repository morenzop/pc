package driver;

public class Car extends Vehicle{

    private String trunkSpace;

    public Car(String hasDoors, String hasWheels, String trunkSpace){
        super(hasDoors,hasWheels);
        this.trunkSpace=trunkSpace;
    }


    @Override
    public int numberOfWheels(int x) {
        return 4;
    }

}
