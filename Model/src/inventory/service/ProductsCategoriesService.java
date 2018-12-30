package inventory.service;

import inventory.dao.ProductsCategoriesDAO;
import inventory.model.ProductsCategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductsCategoriesService {

    @Autowired
    private ProductsCategoriesDAO productsCategoriesDAO;

    public Iterable<ProductsCategories> showAll () {
        return this.productsCategoriesDAO.findAll();
    }

    public Optional<ProductsCategories> showById (Integer id) {
        return this.productsCategoriesDAO.findById(id);
    }

    public void save (ProductsCategories productsCategories) {
        this.productsCategoriesDAO.save(productsCategories);
    }

    public void delete (ProductsCategories productsCategories) {
        this.productsCategoriesDAO.delete(productsCategories);
    }
}
