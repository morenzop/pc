package friday13;

import java.util.Random;
import java.util.Scanner;

public class PersonTests {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome, what's your name?");
        String shortyName= scanner.nextLine();

        System.out.println("Nice to meet ya " + shortyName);


        Scanner product = new Scanner(System.in);
        int[] vars = new int[3];

        for(int i = 0; i < vars.length; i++) {
            System.out.println("Your items please: ");
            vars[i] = product.nextInt();
        }
        System.out.println(vars[0] + vars[1] + vars[2]);

//
//        Scanner number = new Scanner(System.in);
//        System.out.println("Hey, whats your number?");
//        long shortyNumber = Long.parseLong(number.nextLine());
//        System.out.println("So the number is " + shortyNumber);
//
//        Person person1= new Person("Ranger Dave", 32);
//
//        System.out.println(person1.makeSomeNoise());

    }
}
