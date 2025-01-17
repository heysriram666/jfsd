package exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import exam.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
