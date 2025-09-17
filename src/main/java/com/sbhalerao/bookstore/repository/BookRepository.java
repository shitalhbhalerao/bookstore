package com.sbhalerao.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sbhalerao.bookstore.model.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	@Query("SELECT b FROM Book b WHERE b.name LIKE %:term%")
	List<Book> findByNameContaining(@Param("term") String term);

}
