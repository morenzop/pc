package justice;

public class SuperHero {
    private String wearsTights;

    public SuperHero(String wearsTights){
        this.wearsTights=wearsTights;
    }

    public void listSuperPowers(){
       String[] superpowers= {"Flight", "Super Strength", "Super Speed", "Telekinesis", "Matter Manipulation"};
       for (int x = 0; x < superpowers.length; x++ ){
           System.out.println(superpowers[x]);
       }
    }

}
