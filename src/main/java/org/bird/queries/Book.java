package org.bird.queries;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Book {
    private String id;
    private String name;
    private int pageCount;
    private String authorId;

    public Book(String id, String name, int pageCount, String authorId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new Book("book-2", "Moby Dick", 635, "author-2"),
            new Book("book-3", "Interview with the vampire", 371, "author-3")
    );

    public static Optional<Book> getById(String id) {
        return books.stream().filter(b -> b.getId().equalsIgnoreCase(id)).findFirst();
    }

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }
}
