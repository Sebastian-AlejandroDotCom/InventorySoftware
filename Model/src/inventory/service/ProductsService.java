package inventory.service;

import inventory.dao.ProductsDAO;
import inventory.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    private ProductsDAO productsDAO;

    public Iterable<Products> showAll () {
        return this.productsDAO.findAll();
    }

    public Optional<Products> showById (Integer id) {
        return this.productsDAO.findById(id);
    }

    public void save (Products product) {
        this.productsDAO.save(product);
    }

    public void delete (Products product) {
        product.setStatus("UNAVAILABLE");
        this.productsDAO.save(product);
    }

}
