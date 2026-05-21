public class LibraryItem<T> {

    private T itemID;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(T itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    // Getters
    public T getItemID() {
        return itemID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemID +
                ", Title: " + title +
                ", Author: " + author;
    }
}
