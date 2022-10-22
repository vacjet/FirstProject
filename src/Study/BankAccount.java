package Study;

public class BankAccount {

    int id;
    String name;
    double balance;


    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Ivan";
        MyAccount.balance = 55.65;

        YourAccount.id = 2;
        YourAccount.name = "Alex";
        YourAccount.balance = 87.42;

        HisAccount.id = 3;
        HisAccount.name = "Anna";
        HisAccount.balance = 247.10;

        System.out.println(MyAccount.name);
        System.out.println(YourAccount.balance);
        System.out.println(HisAccount.id);
    }
}