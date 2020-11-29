package se.pscode.productapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.pscode.productapi.model.Book;
import se.pscode.productapi.service.BookService;

import java.util.List;

@RestController()
@RequestMapping("/api/v1")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/allBooks")
    public List<Book> getAllProducts(){
        return bookService.findAllBooks();
    }
}
