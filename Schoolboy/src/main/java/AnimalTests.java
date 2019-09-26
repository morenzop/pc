public class AnimalTests {
    public static void main(String[] args) {
        Animals cat= new Cat("moogle", "Friskies");
        Animals dog= new Dog("Rufus","Steak");

        System.out.println(cat.makeNoise("Meow"));;
        System.out.println(dog.makeNoise("Woof"));;
    }

}
