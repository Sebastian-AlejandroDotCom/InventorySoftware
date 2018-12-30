package inventory.dao;

import inventory.model.OrdersProducts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrdersProductsDAO extends CrudRepository<OrdersProducts, Integer> {
}
