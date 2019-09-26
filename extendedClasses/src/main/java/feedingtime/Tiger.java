package feedingtime;

public class Tiger extends Animals {

    private String stripedPattern;

    public Tiger(String typeOfFood, String stripedPattern){
        super (typeOfFood);
        this.stripedPattern = stripedPattern;
    }

    @Override
    public String eats() {
        return "Meat";
    }
}

