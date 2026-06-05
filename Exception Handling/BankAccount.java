
public class BankAccount {
  private double bankBalance;

  public BankAccount(double initialBalance) {
    if (initialBalance < 0) {
      throw new IllegalArgumentException("Initial Balance cannot be negative");

    }
    this.bankBalance = initialBalance;
  }

  public double getBalance() {
    return bankBalance;
  }

  public void withdraw(double amount) throws CustomException {
    if (amount < 0) {
      throw new IllegalArgumentException("Withdrawal Amount cannot be negative ");
    }

    if (amount > bankBalance) {
      throw new CustomException(bankBalance, amount);
    }

    bankBalance -= amount;
    System.out.printf("Withdraw %.2f , New Balance %.2f", amount, bankBalance);
  }

  public void deposit(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Deposit cannot be negative");
    }

    bankBalance += amount;
    System.out.printf("Deposited %.2f , New Balance %.2f", amount, bankBalance);
  }

}
