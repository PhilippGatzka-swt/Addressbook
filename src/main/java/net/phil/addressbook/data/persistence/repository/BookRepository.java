package net.phil.addressbook.data.persistence.repository;

import net.phil.addressbook.data.persistence.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
  List<Book> findByTitle(String title);
}
