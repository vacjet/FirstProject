package Study;

public class BankAccount3Test {
    public static void main(String[] args) {
        BankAccount3 MyAccount = new BankAccount3();
        MyAccount.popolnenieScheta(50);
        MyAccount.snyatieSoScheta(60);
    }
}

class BankAccount3 {
    int id = 10;
    String name = "Иванов";
    double balance = 100;

    void popolnenieScheta(double summaPopolneniya) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс пополнен на: " + summaPopolneniya);
        balance += summaPopolneniya;
        System.out.println("Баланс после пополнения: " + balance);
        System.out.println();
    }

    void snyatieSoScheta(double summaSnyatiya) {
        System.out.println("Баланс до снятия: " + balance);
        System.out.println("Баланс уменьшен на: " + summaSnyatiya);
        balance -= summaSnyatiya;
        System.out.println("Баланс после снятия: " + balance);
        System.out.println();
    }
}