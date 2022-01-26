package com.example.chmurka.repositories;

import com.example.chmurka.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
