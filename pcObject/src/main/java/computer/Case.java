package computer;


import java.awt.*;

public class Case extends PC {
   private String model;
   private String manufacturer;
   private String powerSupply;
   private Dimensions dimensions;

   public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions){
       super();
       this.model=model;
       this.manufacturer=manufacturer;
       this.powerSupply=powerSupply;
       this.dimensions=dimensions;

   }
public void pressPowerButton(){
    System.out.println("power Button Pressed");
}

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }
}
