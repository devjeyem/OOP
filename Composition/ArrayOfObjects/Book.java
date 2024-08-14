public class Book {
    // Private instance variables
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // Constructors
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // New method to get authors' names
    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length; i++)
        {
            if (i>0)
                authorNames += ", ";
            authorNames += authors[i].getName();
        }
        return authorNames;
    }

    // toString method
    @Override
    public String toString() {
        String authorsStr = "";
        for (int i = 0; i < authors.length; i++) {
            if (i > 0) {
                authorsStr += ", ";
            }
            authorsStr += authors[i].toString();
        }
        return "Book[name=" + name + ",authors={" + authorsStr + "},price=" + price + ",qty=" + qty + "]";
    }
}
