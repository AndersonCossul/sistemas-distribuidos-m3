import java.rmi.Naming;
import java.rmi.RemoteException;

public class Client {
  public static void main(String[] args) {
    try {
      Account account = (Account) Naming.lookup("rmi://localhost/Account");
      System.out.println();
      System.out.println("Depositing 900...");
      account.deposit(900.0);
      System.out.println("Withdrawing 150...");
      account.withdraw(150.0);
      double balance = account.getBalance();
      System.out.println("Balance: " + balance);
    } catch (RemoteException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}