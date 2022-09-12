package net.phil.addressbook.controller.rest;

import net.phil.addressbook.data.persistence.entity.Book;
import net.phil.addressbook.data.persistence.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

  private final BookRepository bookRepository;

  public BookController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @GetMapping
  public Iterable<Book> findAll() {
    return bookRepository.findAll();
  }

}
