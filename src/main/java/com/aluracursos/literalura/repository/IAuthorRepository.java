package com.aluracursos.literalura.repository;

import com.aluracursos.literalura.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IAuthorRepository extends JpaRepository<Author,Long> {

    Optional<Author> findByCompleteName(String authorName);


    @Query("SELECT a FROM Author a " +
            "WHERE a.birthYear IS NOT NULL AND a.birthYear <= :endYear " +
            "AND (a.deathYear IS NULL OR a.deathYear >= :startYear)")
    List<Author> authorsLiveIn(Integer startYear, Integer endYear);
}
