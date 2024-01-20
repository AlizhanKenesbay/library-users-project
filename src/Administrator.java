public interface Administrator {
    void issueBook(Reader reader, String bookTitle);
    void overdueNotification(Reader reader, String bookTitle);
}
