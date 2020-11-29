package exercise06;

public class Book {
    private static int numberCode = 100;
    private int number;
    private String title;
    private String author;

    public Book(String title, String author) {
        number = numberCode++;
        this.title = title;
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

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

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book)
            return ((Book)obj).number == this.number;
        return false;
    }

    public void getLateFees() {

    }

    public void set(){}
}
