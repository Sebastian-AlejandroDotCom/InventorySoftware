package inventory.dao;

import inventory.model.ProductsDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductsDetailsDAO extends CrudRepository<ProductsDetails, Integer> {
}
