package by.teachmeskills.eshop.repository;

import by.teachmeskills.eshop.repository.domain.Category;
import by.teachmeskills.eshop.repository.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAllByUserId(int id);
}
