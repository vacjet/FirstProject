package Study;

public class BankAccount2 {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount2 MyAccount = new BankAccount2();
        BankAccount2 YourAccount = new BankAccount2();
        BankAccount2 HisAccount = new BankAccount2();
        Popolnenie ppl = new Popolnenie();
        Snyatie snn = new Snyatie();

        MyAccount.id = 1;
        MyAccount.name = "Иван";
        MyAccount.balance = 55.65;
        double snyatieSoScheta = snn.snyat(MyAccount.balance, 10.0);
//        double itog = MyAccount.balance - snyatieSoScheta;

        YourAccount.id = 2;
        YourAccount.name = "Alex";
        YourAccount.balance = 87.42;
        double snyatieSoScheta2 = snn.snyat(YourAccount.balance, 20);

        HisAccount.id = 3;
        HisAccount.name = "Anna";
        HisAccount.balance = 247.10;
        double snyatieSoScheta3 = snn.snyat(HisAccount.balance, 30);

        System.out.println("Баланс пополнен на: " + ppl.pop1);
        System.out.println(MyAccount.id + " | " + MyAccount.name + " | " + "Старый баланс: " + MyAccount.balance + " // Баланс после пополнения: " + (MyAccount.balance + ppl.pop1) + " | Остаток после снятия без учета пополнения: " + snyatieSoScheta);
        System.out.println(YourAccount.id + " | " + YourAccount.name + " | " + "Старый баланс: " + YourAccount.balance + " // Баланс после пополнения: " + (YourAccount.balance + ppl.pop1) + " | Остаток после снятия без учета пополнения: " + snyatieSoScheta2);
        System.out.println(HisAccount.id + " | " + HisAccount.name + " | " + "Старый баланс: " + HisAccount.balance + " // Баланс после пополнения: " + (HisAccount.balance + ppl.pop1) + " | Остаток после снятия без учета пополнения: " + snyatieSoScheta3);
    }
}

class Popolnenie {
    Popolnenie() {
        pop1 = 20;
    }

    double pop1;
}

class Snyatie {
    double snyat(double a, double b) {
        double result = a - b;
        System.out.println("Баланс уменьшен на: " + b);
        return result;
    }

}