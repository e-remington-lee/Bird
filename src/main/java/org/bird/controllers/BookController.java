package org.bird.controllers;
import org.bird.queries.Author;
import org.bird.queries.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;


@Controller
public class BookController {

    @QueryMapping
    public Book bookById(@Argument String id) {
        System.out.printf("IDFK");
        return Book.getById(id).orElse(null);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.getAuthorId()).orElse(null);
    }
}
