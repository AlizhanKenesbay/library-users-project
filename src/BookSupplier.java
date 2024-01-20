public class BookSupplier implements Supplier {
    private String name;

    public BookSupplier(String name) {
        this.name = name;
    }

    @Override
    public void borrowBook() {
        System.out.println(getName() + " взял книгу");
    }

    @Override
    public void returnBorrowedBook() {
        System.out.println(getName() + " вернул книгу");
    }

    @Override
    public void deliverBook(String bookTitle) {
        System.out.println(getName() + " доставил книгу '" + bookTitle + "' ");
    }

    @Override
    public String getName() {
        return name;
    }
}