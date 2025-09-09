package school.sorokin.javacore.OOP.lesson5;

public class Main {

    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(0, -1000);
        SavingAccount savingAccount = new SavingAccount(0);
        Printable credit = creditAccount;
        Printable saving = savingAccount;
        credit.printInfo();
        saving.printInfo();
        creditAccount.deposit(500);
        savingAccount.deposit(900);
        credit.printInfo();
        saving.printInfo();
        creditAccount.withdraw(200);
        savingAccount.withdraw(400);
        credit.printInfo();
        saving.printInfo();
        creditAccount.withdraw(600);
        savingAccount.withdraw(800);
        credit.printInfo();
        saving.printInfo();
        creditAccount.withdraw(900);
        savingAccount.withdraw(1800);
        credit.printInfo();
        saving.printInfo();

    }
}
