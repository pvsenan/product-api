package se.pscode.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.pscode.productapi.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
