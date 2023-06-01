import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AccountImpl extends UnicastRemoteObject implements Account {
  private double balance;

  public AccountImpl() throws RemoteException {
    balance = 0.0;
  }

  @Override
  public void deposit(double value) throws RemoteException {
    balance += value;
    System.out.println("Deposit made! New balance: " + balance);
  }

  @Override
  public void withdraw(double value) throws RemoteException {
    if (value <= balance) {
      balance -= value;
      System.out.println(value + " withdrawn. New balance: " + balance);
    } else {
      System.out.println("Not enough balance.");
    }
  }

  @Override
  public double getBalance() throws RemoteException {
    return balance;
  }
}