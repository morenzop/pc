public class Personality {
    public String thinkType;
    public String favColor;

    public Personality(String thinkType, String favColor){
        this.favColor=favColor;
        this.thinkType=thinkType;
    }

    @Override
    public String toString() {
        return "Personality{" +
                "thinkType='" + thinkType + '\'' +
                ", favColor='" + favColor + '\'' +
                '}';
    }
}
