package exam.service;


import exam.model.Order;
import exam.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        System.out.println("Saving order to DB: " + order);
        return orderRepository.save(order);
    }

}
