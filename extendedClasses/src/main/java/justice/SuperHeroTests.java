package justice;

public class SuperHeroTests {
    public static void main(String[] args) {

        SuperHero supe = new SuperHero("Color");

        TheFlash flash = new TheFlash("Red and Yellow","Normal");

        DrManhattan drManhattan = new DrManhattan("None","Yes");

        flash.listSuperPowers();
    }
}
