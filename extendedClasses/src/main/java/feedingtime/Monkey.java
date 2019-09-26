package feedingtime;

public class Monkey extends Animals {

    private String tail;

    public Monkey(String typeOfFood, String tail) {
        super(typeOfFood);
        this.tail = tail;
    }
   @Override
   public String eats() {
        return "Bananas";
    }

}
