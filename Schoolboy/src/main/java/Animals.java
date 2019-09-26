public class Animals {
    private String name;
    private String food;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


    public Animals(String name, String food) {
        this.name=name;
        this.food=food;
    }
    public String makeNoise(){
       return "";
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
