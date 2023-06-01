import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Account extends Remote {
  void deposit(double value) throws RemoteException;
  void withdraw(double value) throws RemoteException;
  double getBalance() throws RemoteException;
}