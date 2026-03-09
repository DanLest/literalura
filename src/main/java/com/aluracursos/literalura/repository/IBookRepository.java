package com.aluracursos.literalura.repository;

import com.aluracursos.literalura.model.Book;
import com.aluracursos.literalura.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IBookRepository extends JpaRepository<Book,Long> {

    List<Book> findByTitleContainsIgnoreCase(String userBook);

    Optional<Book> findByTitleEqualsIgnoreCase(String userBook);

    @Query("SELECT b FROM Book b " +
            "WHERE b.language = :userLanguageEnum")
    List<Book> registeredBookByLanguage(Language userLanguageEnum);
}
