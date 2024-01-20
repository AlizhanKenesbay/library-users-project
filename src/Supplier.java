public interface Supplier extends Reader {
    void deliverBook(String bookTitle);
    String getName();
}