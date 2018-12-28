package inventory.service;

import inventory.dao.ProductsDAO;
import inventory.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {

    @Autowired
    private ProductsDAO productsDAO;

    public Iterable<Products> showAll () {
        return this.productsDAO.findAll();
    }
}
