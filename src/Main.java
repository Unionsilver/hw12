public class Main {
    public static void main(String[] args) {
        Author lermontov = new Author("Michail ", "Lermontov ");
        Book borodino = new Book("Borodino ", lermontov, 1839);

        System.out.println("Книга " + borodino.getTitle() + "опубликованно " + borodino.getPublicationYear() +
                " автор " + borodino.getAuthor().getName() + " " + borodino.getAuthor().getSurname());
        Author author = borodino.getAuthor();
        author.getName();

        borodino.setPublicationYear(1837);

        System.out.println(borodino.getPublicationYear());


    }
}


