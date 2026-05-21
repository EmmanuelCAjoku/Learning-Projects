import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GenericCatalog<LibraryItem<Integer>> catalog = new GenericCatalog<>();

        int choice;

        do {
            System.out.println("\n===== GENERIC LIBRARY CATALOG =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Retrieve Item");
            System.out.println("4. View Catalog");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Item ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    LibraryItem<Integer> item =
                            new LibraryItem<>(id, title, author);

                    catalog.addItem(item);
                    break;

                case 2:
                    System.out.print("Enter Item ID to remove: ");
                    int removeID = scanner.nextInt();
                    catalog.removeItem(removeID);
                    break;

                case 3:
                    System.out.print("Enter Item ID to retrieve: ");
                    int retrieveID = scanner.nextInt();
                    catalog.retrieveItem(retrieveID);
                    break;

                case 4:
                    catalog.displayCatalog();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
