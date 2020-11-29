package se.pscode.productapi.service;

import org.springframework.stereotype.Service;
import se.pscode.productapi.model.Book;
import se.pscode.productapi.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

}
