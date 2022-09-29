package ch01;
// 01. Object 클래스 - 모든 클래스의 최상위 클래스
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + ", " + author;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("데미안", "헤르만 헤세");

        System.out.println(book);
    }
}
