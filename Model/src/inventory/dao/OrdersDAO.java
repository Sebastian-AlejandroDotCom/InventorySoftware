package inventory.dao;

import inventory.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface OrdersDAO extends CrudRepository<Orders, Integer> {
}
