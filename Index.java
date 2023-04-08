import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Index {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to OASIS ATM");
        System.out.println("Please enter your User ID and Password : ");
        String Id = sc.nextLine();
        String password = sc.nextLine();

        if (correctDetails(Id, password)) {

            boolean quite = false;
            while (!quite) {

                System.out.println("Select :");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Transfer");
                System.out.println("4. Transaction History");
                System.out.println("5. Quit");

                int choosed = sc.nextInt();
                if (choosed == 1) {

                    // Transaction History

                } else if (choosed == 2) {

                    // Withdraw

                } else if (choosed == 3) {

                    // Deposit

                } else if (choosed == 4) {

                    // Transfer

                } else if (choosed == 5) {
                    quite = true;
                } else {
                    System.out.println("Please enter correct choise between 1-5");
                }
            }
        }
    }

    // Registration

    // Login Credential Check

    static boolean correctDetails(String id, String password) {
        Map<String, String> users = new HashMap<String, String>();
        users.put("1", "100");
        users.put("2", "200");
        if (users.containsKey(id) && users.get(id).equals(password)) {
            return true;
        }
        return false;
    }
}
