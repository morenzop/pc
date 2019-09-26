package feedingtime;

public class AnimalTests {
    public static void main(String[] args) {

        Animals animals = new Animals("Food");

        Monkey prowler = new Monkey("Bananas", "Yes");

        Tiger bengal = new Tiger("Meat", "Yes");

        System.out.println(bengal.eats());
    }
}
