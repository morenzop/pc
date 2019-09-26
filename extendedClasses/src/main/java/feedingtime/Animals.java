package feedingtime;

public class Animals {

    private String typeOfFood;

    public Animals(String typeOfFood){
        this.typeOfFood = typeOfFood;
    }


    public String eats(){
        return typeOfFood;
    }

    public String eats(String foodName) {
        typeOfFood = foodName;
        return typeOfFood;
    }
}
