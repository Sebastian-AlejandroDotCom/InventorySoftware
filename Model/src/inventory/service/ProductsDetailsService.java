package inventory.service;

import inventory.dao.ProductsDetailsDAO;
import inventory.model.ProductsDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductsDetailsService {

    @Autowired
    private ProductsDetailsDAO productsDetailsDAO;

    public Iterable<ProductsDetails> showAll () {
        return this.productsDetailsDAO.findAll();
    }

    public Optional<ProductsDetails> showById (Integer id) {
        return this.productsDetailsDAO.findById(id);
    }

    public void save (ProductsDetails productsDetails) {
        this.productsDetailsDAO.save(productsDetails);
    }

    public void delete (ProductsDetails productsDetails) {
        this.productsDetailsDAO.delete(productsDetails);
    }
}
