package school.sorokin.javacore.OOP.lesson5;

public class SavingAccount extends Account implements Printable {

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public double withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.printf("На балансе счёта %s недостаточно средств для снятия суммы %s\n",
                    SavingAccount.class.getSimpleName(), amount);
        }
        return balance;
    }

    @Override
    public void printInfo() {
        System.out.printf("Тип счета - %s, баланс счёта: %s\n", SavingAccount.class.getSimpleName(), balance);
    }
}
