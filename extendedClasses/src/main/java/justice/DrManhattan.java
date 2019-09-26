package justice;

public class DrManhattan extends SuperHero {

    private String nakedAndBlue;

    public DrManhattan(String wearsTights, String nakedAndBlue){
        super (wearsTights);
        this.nakedAndBlue=nakedAndBlue;
    }

    @Override
    public void listSuperPowers() {
        String[] superpowers = {"Flight", "Super Strength", "Super Speed", "Telekinesis", "Matter Manipulation"};
        System.out.println(superpowers[4]);;
    }
}
