import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
  public static void main(String[] args) {
    try {
      Account account = new AccountImpl();
      LocateRegistry.createRegistry(1099);
      Naming.rebind("Account", account);
      System.out.println();
      System.out.println("Server ready...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}