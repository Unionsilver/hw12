public class Book {
    String nameBook;
    String authorName;
    int yearsOfBook;

    public Book(String nameBook, String authorName, int yearsOfBook) {
        this.nameBook = nameBook;
        this.authorName = authorName;
        this.yearsOfBook = yearsOfBook;
    }

    public void setAge(int yearsOfBook) {

        this.yearsOfBook = yearsOfBook;
    }
    public int getAge() {
        return this.yearsOfBook;
    }

}





