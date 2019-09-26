package makeAnimal;

public class Animal {
public String eyes;

         public Animal(String eyes){
         this.eyes = eyes;
         }
         public void makeNoise(){
             System.out.println("Blokka");
         }

    @Override
    public String toString() {
        return "Animal{" +
                "eyes='" + eyes + '\'' +
                '}';
    }
}