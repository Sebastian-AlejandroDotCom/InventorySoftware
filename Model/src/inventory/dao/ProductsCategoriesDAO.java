package inventory.dao;

import inventory.model.ProductsCategories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductsCategoriesDAO extends CrudRepository<ProductsCategories, Integer> {
}
