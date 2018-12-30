package inventory.service;

import inventory.dao.CategoriesDAO;
import inventory.model.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesDAO categoriesDAO;

    public Iterable<Categories> showAll () {
        return this.categoriesDAO.findAll();
    }

    public Optional<Categories> showById (Integer id) {
        return this.categoriesDAO.findById(id);
    }

    public void save (Categories category) {
        this.categoriesDAO.save(category);
    }

    public void delete (Categories category) {
        this.categoriesDAO.delete(category);
    }
}
