package by.teachmeskills.eshop.repository;

import by.teachmeskills.eshop.repository.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAllByCategory_Id(int categoryId, Pageable pageable);

    int countProductByCategory_Id(int id);
}
