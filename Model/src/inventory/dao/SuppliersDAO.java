package inventory.dao;

import inventory.model.Suppliers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SuppliersDAO extends CrudRepository<Suppliers, Integer> {
}
