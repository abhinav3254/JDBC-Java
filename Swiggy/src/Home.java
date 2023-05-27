import java.io.BufferedReader;
import java.io.InputStreamReader;

import orders.Customers;
import orders.OrdersDoa;

public class Home {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to swiggy");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Enter 1 to add customer");
            System.out.println("Enter 2 to get details");
            System.out.println("Enter 3 to edit details");
            System.out.println("Enter 4 to delete details");
            System.out.println("Enter 5 to exit");

            int choice = Integer.parseInt(br.readLine());

            if (choice == 1) {
                System.out.println("Enter User Name");
                String name = br.readLine();
                System.out.println("Enter Password of 6 letters");
                String password = br.readLine();
                System.out.println("Enter City");
                String city = br.readLine();

                Customers customers = new Customers(name, password, city);
                boolean ans = OrdersDoa.insertCustomer(customers);

                if (ans)
                    System.out.println("Inserted");
                else
                    System.out.println("Something went wrong");
            } else if (choice == 5) {
                break;
            } else {
            }
        }

        System.out.println("Log out");
    }
}
