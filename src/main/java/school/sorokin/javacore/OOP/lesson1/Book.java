package school.sorokin.javacore.OOP.lesson1;

public class Book {

    private String title;
    private String author;
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void read() {
        System.out.println("Вы читаете книгу " + "\"" + title + "\"" + " авторства " + author);
    }
}
