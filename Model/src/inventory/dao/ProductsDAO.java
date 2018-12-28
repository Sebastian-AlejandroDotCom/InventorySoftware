package inventory.dao;

import inventory.model.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductsDAO extends CrudRepository<Products, Integer> {
}
