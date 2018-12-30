package inventory.dao;

import inventory.model.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CategoriesDAO extends CrudRepository<Categories, Integer> {
}
