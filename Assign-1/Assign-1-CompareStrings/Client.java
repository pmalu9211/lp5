import java.rmi.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String serverURL = "rmi://localhost/Server";
            // String serverIP = (args.length > 0) ? args[0] : "localhost";
            // String serverURL = "rmi://" + serverIP + "/Server";
            ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);

            System.out.print("Enter First String: ");
            String str1 = sc.nextLine();

            System.out.print("Enter Second String: ");
            String str2 = sc.nextLine();

            System.out.println("--------------------Result--------------------");
            System.out.println("Lexicographically Largest String Is: " + serverIntf.compareStrings(str1, str2));

        } catch (Exception e) {
            System.out.println("Exception Occurred At Client! " + e.getMessage());
        }

        sc.close();
    }
}
