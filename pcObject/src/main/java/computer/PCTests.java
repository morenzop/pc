package computer;

public class PCTests {
    public static void main(String[] args) {

        PC pc;
        pc = new PC(new Case("H420", "Fuji", "240PowerSupply",
                new Dimensions(20, 25, 5)),
                new Monitor("27 inch Beast", "HP", 27, new Resolution(100, 200)),
                new Motherboard("BJ-300", "Pentium", 4,
                6, "V2-44"));

        PC.description();
        PC.powerUp();
    }
}
