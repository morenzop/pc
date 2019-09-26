package justice;

public class TheFlash extends SuperHero {

    private String speedForce;

    public TheFlash(String wearsTights, String speedForce){
        super (wearsTights);
        this.speedForce=speedForce;
    }

    @Override
    public void listSuperPowers() {
        String[] superpowers = {"Flight", "Super Strength", "Super Speed", "Telekinesis", "Matter Manipulation"};
        System.out.println(superpowers[2]);;
    }
}
