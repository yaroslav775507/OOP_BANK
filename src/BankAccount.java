public class BankAccount {
    private final static double DEFALUT_INTEREST_RATE = 0.02;
    private static double interesetRate = DEFALUT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;
    public BankAccount() {
        this.id = bankAccountCount++;
    }
    public static void setInteresetRate(double interesetRate) {
        BankAccount.interesetRate = interesetRate;
    }
    public double getInterest(double years) {
        return BankAccount.interesetRate * years * this.balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}

