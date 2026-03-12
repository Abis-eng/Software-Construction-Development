import java.util.Scanner;

public class TelecomBilling {

    public static double calculateBill(Customer c) {

        double bill = 0;

        switch (Character.toUpperCase(c.getPackageType())) {

            case 'A':
                bill = 300;
                if (c.getMinutesUsed() > 100) {
                    bill += (c.getMinutesUsed() - 100) * 2;
                }
                break;

            case 'B':
                bill = 500;
                if (c.getMinutesUsed() > 250) {
                    bill += (c.getMinutesUsed() - 250) * 1.5;
                }
                break;

            case 'C':
                bill = 800;
                break;

            default:
                System.out.println("Invalid Package");
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=n;i++) {

            System.out.println("\nCustomer " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Phone (11 digits): ");
            String phone = sc.nextLine();

            System.out.print("Enter Package (A/B/C): ");
            char pack = sc.next().charAt(0);

            System.out.print("Enter Minutes Used: ");
            int minutes = sc.nextInt();
            sc.nextLine();

            Customer c = new Customer(name, phone, pack, minutes);

            double bill = calculateBill(c);

            System.out.println("Customer: " + c.getName());
            System.out.println("Total Bill: " + bill);
        }

        sc.close();
    }
}