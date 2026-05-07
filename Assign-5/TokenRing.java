import java.util.Scanner;

// Token Ring Network Simulation Program
public class TokenRing {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input number of nodes in the network
        System.out.print("Enter The Number Of Nodes: ");
        int n = sc.nextInt();

        // Display all nodes in ring format
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        // Connect last node back to first node
        System.out.println("0");

        // Variable to control loop repetition
        int ch = 0;

        // Repeat until user chooses to stop
        do {

            // Input sender node
            System.out.print("Enter Sender: ");
            int sender = sc.nextInt();

            // Input receiver node
            System.out.print("Enter Receiver: ");
            int receiver = sc.nextInt();

            // Input data to be transmitted
            System.out.print("Enter Data To Send: ");
            int data = sc.nextInt();

            // Display token passing process
            System.out.print("Token Passing: ");

            // Initial token position
            int token = 0;

            // Pass token from node 0 to sender
            for (int i = token; i < sender; i++) {
                System.out.print(" " + i + "-->");
            }

            // Sender receives the token
            System.out.println(" " + sender);

            // Sender starts sending data
            System.out.println("Sender " + sender + " Sending Data: " + data);

            // Forward data until it reaches receiver
            for (int i = sender; i != receiver; i = (i + 1) % n) {

                // Data forwarded by intermediate nodes
                System.out.println("Data " + data + " Forwarded by " + i);
            }

            // Receiver receives data
            System.out.println(
                    "Receiver " + receiver + " Received The Data: " + data + "\n");

            // Update token position
            token = sender;

            // Ask user whether to continue
            System.out.print(
                    "Do You Want To Send Data Again? Enter 1 For Yes And 0 For No : ");

            ch = sc.nextInt();

        } while (ch == 1); // Continue if user enters 1

        // Close scanner object
        sc.close();
    }
}