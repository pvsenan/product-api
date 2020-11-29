package se.pscode.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.pscode.productapi.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
