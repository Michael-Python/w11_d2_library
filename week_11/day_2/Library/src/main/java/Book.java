import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public String bookName(){
        return this.title;
    }
    public String bookAuthor(){
        return this.author;
    }
    public String bookGenre(){
        return this.genre;

    }
}
