
public class BankDemo {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(100.00);
    System.out.println("Initial Balance:" + account.getBalance());

    try {
      account.withdraw(200.00);

    } catch (CustomException e) {
      System.out.println(e.getMessage());
    }

    account.deposit(150.00);

    try {
      account.withdraw(100.00);
    } catch (CustomException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Final balance: " + account.getBalance());
  }
}
