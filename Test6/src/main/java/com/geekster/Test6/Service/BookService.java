package com.geekster.Test6.Service;

import com.geekster.Test6.Model.Book;
import com.geekster.Test6.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(String id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBook(String id) {
        bookRepo.deleteById(id);

    }
}
