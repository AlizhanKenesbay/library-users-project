public class User implements Reader, Librarian, Administrator {
    private String name;

    public User(String name) {
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
    public void orderBook(Supplier supplier, String bookTitle) {
        System.out.println(getName() + " заказал у " + supplier.getName() + " книгу " + bookTitle);
    }

    @Override
    public void issueBook(Reader reader, String bookTitle) {
        System.out.println(getName() + " выдал книгу '" + bookTitle + "' для " + reader.getName());
    }

    @Override
    public void overdueNotification(Reader reader, String bookTitle) {
        System.out.println(getName() + " уведомил о просрочке книги '" + bookTitle + "' для " + reader.getName());
    }

    public String getName() {
        return name;
    }
}