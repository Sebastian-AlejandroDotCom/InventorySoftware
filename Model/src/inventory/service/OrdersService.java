package inventory.service;

import inventory.dao.OrdersDAO;
import inventory.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdersService {

    @Autowired
    private OrdersDAO ordersDAO;

    public Iterable<Orders> showAll () {
        return this.ordersDAO.findAll();
    }

    public Optional<Orders> showById (Integer id) {
        return this.ordersDAO.findById(id);
    }

    public void save (Orders order) {
        this.ordersDAO.save(order);
    }

    public void dalete (Orders order) {
        order.setStatus("UNAVAILABLE");
        this.ordersDAO.save(order);
    }

}
