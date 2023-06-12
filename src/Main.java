public class Main {
    public static void main(String[] args) {

        Book book = new Book("Програмсист ", "Игорь", 1992);
        System.out.println("book.nameBook = " + book.nameBook);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearsOfBook = " + book.yearsOfBook);

        book.nameBook = " беда книга ";
        System.out.println("book.nameBook = " + book.nameBook);
        book.nameBook = " беда2 книга ";
        System.out.println("book.nameBook = " + book.nameBook);

        book.authorName = " Автор Женя ";
        System.out.println("book.authorName = " + book.authorName);
        book.authorName = " Автор Олег ";
        System.out.println("book.authorName = " + book.authorName);

        book.yearsOfBook = 1800;
        System.out.println("book.yearsOfBook = " + book.yearsOfBook);
        book.setAge(1850);
        System.out.println("book.getAge() = " + book.getAge());
        book.yearsOfBook = 1900;
        System.out.println("book.yearsOfBook = " + book.yearsOfBook);
        book.setAge(1950);
        System.out.println("book.getAge() = " + book.getAge());

        book.nameBook = "Happy";
        System.out.println("book.nameBook = " + book.nameBook);

        book.authorName = "Bratus Ihor";
        System.out.println("book.authorName = " + book.authorName);


        book.yearsOfBook = 1500;
        System.out.println("book.yearsOfBook = " + book.yearsOfBook);
        book.setAge(1501);
        System.out.println("book.getAge() = " + book.getAge());


        Author author = new Author("Игорь", "Братусь");

        System.out.println("author.nameAndSurname = " + author.nameAndSurname);
        System.out.println("author.surname = " + author.surname);


        author.nameAndSurname = "Игорь Братусь";
        System.out.println("author.nameAndSurname. = " + author.nameAndSurname);

        author.nameAndSurname = "mama";
        System.out.println("author.nameAndSurname = " + author.nameAndSurname);
        author.nameAndSurname = "papa";
        System.out.println("author.nameAndSurname = " + author.nameAndSurname);
    }
}


