package balanceBook;

public class AccountTests {
    public static void main(String[] args) {
        Account acc1= new Account("Jimbob Dundersnatch", 5000.5f);
        System.out.println(acc1);
        acc1.withdraw(-15f);
        acc1.deposit(5f);
    }
}
