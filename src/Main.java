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
        System.out.println(lermontov.toString());
        System.out.println(borodino.toString());
        Author lermontov1 = new Author("Michai ", "Lermontov ");
        System.out.println("lermontov.equals(lermontov1) = " + lermontov.equals(lermontov1));
        System.out.println("lermontov.hashCode() = " + lermontov.hashCode());
        System.out.println("borodino.hashCode() = " + borodino.hashCode());
        System.out.println("lermontov.equals(author) = " + lermontov.equals(author));
    }
}

