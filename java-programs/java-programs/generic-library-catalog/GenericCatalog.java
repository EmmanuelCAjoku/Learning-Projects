import java.util.ArrayList;
import java.util.List;

public class GenericCatalog<T extends LibraryItem<?>> {

    private List<T> catalog;

    // Constructor
    public GenericCatalog() {
        catalog = new ArrayList<>();
    }

    // Add item
    public void addItem(T item) {
        catalog.add(item);
        System.out.println("Item added successfully.");
    }

    // Remove item
    public void removeItem(Object itemID) {

        T itemToRemove = null;

        for (T item : catalog) {
            if (item.getItemID().equals(itemID)) {
                itemToRemove = item;
                break;
            }
        }

        if (itemToRemove != null) {
            catalog.remove(itemToRemove);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Error: Item not found in catalog.");
        }
    }

    // View catalog
    public void displayCatalog() {

        if (catalog.isEmpty()) {
            System.out.println("Catalog is empty.");
        } else {

            System.out.println("\nLibrary Catalog:");

            for (T item : catalog) {
                System.out.println(item);
            }
        }
    }

    // Retrieve item details
    public void retrieveItem(Object itemID) {

        boolean found = false;

        for (T item : catalog) {

            if (item.getItemID().equals(itemID)) {

                System.out.println("Item Found:");
                System.out.println(item);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Error: Item not found.");
        }
    }
}
