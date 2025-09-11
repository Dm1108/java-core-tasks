package school.sorokin.javacore.OOP.Lesson7;

public class Library {

    public static void main(String[] args) {
        Book book = new Book("Война и мир", "Лев Толстой");
        Book book2 = new Book("1984", "Джордж Оруэлл");
        Book book3 = new Book("Лолита", "Владимир Набоков");
        Book book4 = new Book("1984", "Джордж Оруэлл");
        Book book5 = new Book("Путешествия Гулливера", "Джонатан Свифт");

        System.out.println(book);
        System.out.println(book2);
        System.out.println((book.equals(book2)) ? "Книги одинаковы" : "Книги разные");
        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());

        System.out.println(book2);
        System.out.println(book4);
        System.out.println((book2.equals(book4)) ? "Книги одинаковы" : "Книги разные");
        System.out.println(book2.hashCode());
        System.out.println(book4.hashCode());

        System.out.println(book2);
        System.out.println(book5);
        System.out.println((book2.equals(book5)) ? "Книги одинаковы" : "Книги разные");
        System.out.println(book2.hashCode());
        System.out.println(book5.hashCode());

        System.out.println(book3);
        System.out.println(book5);
        System.out.println((book3.equals(book5)) ? "Книги одинаковы" : "Книги разные");
        System.out.println(book3.hashCode());
        System.out.println(book5.hashCode());
    }
}
