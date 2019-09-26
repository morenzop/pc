package balanceBook;

public class Account {
    public String name;
            public Float balance;

    public Account(String name, Float balance) {
        this.name=name;
        this.balance=balance;
    }
    public void deposit(Float n){
        if (balance > 0 && !(n < 0)){
            System.out.println(balance += n);
        }else{
            System.out.println("Insufficient Funds");
        }
    }
    public void withdraw(Float n){
        if (n > balance || n < 0){
            System.out.println("Too Much");
        }else{
            System.out.println(balance -= n);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

