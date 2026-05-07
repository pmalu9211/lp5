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

            System.out.print("Enter A Word: ");
            String word = sc.nextLine();

            System.out.println("--------------------Result--------------------");
            System.out.println("Number Of Vowels Present Are: " + serverIntf.countVowels(word));

        } catch (Exception e) {
            System.out.println("Exception Occurred At Client! " + e.getMessage());
        }

        sc.close();
    }
}
