package inventory.service;

import inventory.dao.SuppliersDAO;
import inventory.model.Suppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SuppliersService {

    @Autowired
    private SuppliersDAO suppliersDAO;

    public Iterable<Suppliers> showAll () {
        return this.suppliersDAO.findAll();
    }

    public Optional<Suppliers> showById (Integer id) {
        return this.suppliersDAO.findById(id);
    }

    public void save (Suppliers supplier) {
        this.suppliersDAO.save(supplier);
    }

    public void delete(Suppliers supplier) {
        this.suppliersDAO.delete(supplier);
    }
}
