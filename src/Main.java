public class Main {
    public static void main(String[] args) {
        User reader = new User("Читатель Андрей");
        User admin = new User("Администратор Михаил");
        User librarian = new User("Библиотекарь Вася");
        BookSupplier supplier = new BookSupplier("Поставщик Петя");

        admin.issueBook(reader, "Анна Каренина");
        admin.overdueNotification(reader, "Анна Каренина");
        System.out.println();

        librarian.orderBook(supplier, "Игра Престолов");
        supplier.deliverBook("Игра Престолов");
        System.out.println();

        librarian.issueBook(supplier, "Кровь пот и пиксели");
        supplier.returnBorrowedBook();
    }
}