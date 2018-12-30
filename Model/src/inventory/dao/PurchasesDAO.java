package inventory.dao;

import inventory.model.Purchases;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PurchasesDAO extends CrudRepository<Purchases, Integer> {
}
