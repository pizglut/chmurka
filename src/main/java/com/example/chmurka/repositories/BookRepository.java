package com.example.chmurka.repositories;

import com.example.chmurka.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
