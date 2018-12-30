package inventory.service;

import inventory.dao.OrdersProductsDAO;
import inventory.model.OrdersProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrdersProductsService {

    @Autowired
    private OrdersProductsDAO ordersProductsDAO;

    public Iterable<OrdersProducts> showAll () {
        return this.ordersProductsDAO.findAll();
    }

    public Optional<OrdersProducts> showById (Integer id) {
        return this.ordersProductsDAO.findById(id);
    }

    public void save (OrdersProducts ordersProducts) {
        this.ordersProductsDAO.save(ordersProducts);
    }

    public void delete (OrdersProducts ordersProducts) {
        this.ordersProductsDAO.delete(ordersProducts);
    }
}
