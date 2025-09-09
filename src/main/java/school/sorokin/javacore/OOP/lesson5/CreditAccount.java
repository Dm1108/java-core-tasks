package school.sorokin.javacore.OOP.lesson5;

public class CreditAccount extends Account implements Printable {

    private final double limitAmount;

    public CreditAccount(double balance, double limitAmount) {
        super(balance);
        this.limitAmount = limitAmount;
    }


    @Override
    public double withdraw(double amount) {
        if (balance - amount >= limitAmount) {
            balance -= amount;
        } else {
            System.out.printf("Вы превышаете предоставленный лимит: %s по счёту %s\n",
                    limitAmount, CreditAccount.class.getSimpleName());
        }
        return balance;
    }

    @Override
    public void printInfo() {
        System.out.printf("Тип счета - %s, лимит по счёту: %s, баланс счёта: %s\n",
                CreditAccount.class.getSimpleName(), limitAmount, balance);
    }
}
