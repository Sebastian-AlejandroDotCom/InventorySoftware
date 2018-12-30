package inventory.service;

import inventory.dao.PurchasesDAO;
import inventory.model.Purchases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PurchasesService {

    @Autowired
    private PurchasesDAO purchasesDAO;

    public Iterable<Purchases> showAll () {
        return this.purchasesDAO.findAll();
    }

    public Optional<Purchases> showById (Integer id) {
        return this.purchasesDAO.findById(id);
    }

    public void save (Purchases purchase) {
        this.purchasesDAO.save(purchase);
    }

    public void delete (Purchases purchase) {
        this.purchasesDAO.delete(purchase);
    }
}
